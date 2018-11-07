package edu.msu.cse.teserver;

import edu.msu.cse.cbowen.te.Magic;
import java.util.ArrayList;
import java.io.File;
import java.util.List;
import java.util.Random;

/**
 * This is the install scene for puzzle.
 *
 * @author nkeppers
 */
public class PuzzleScene extends ServerScene {

    public static final int RED_CUE = 6;
    public static final int MAGENTA_CUE = 3;
    public static final int YELLOW_CUE = 5;
    public static final int CYAN_CUE = 7;
    public static final int ORANGE_CUE = 2;
    public static final int GREEN_CUE = 17;

    public static final String PUZZLE_DIR = "puzzles";

    /**
     * List of color cues to denote specific groups
     */
    private static final int[] COLOR_CUES = {RED_CUE, CYAN_CUE, YELLOW_CUE, GREEN_CUE};

    /**
     * The server directory (for getting the puzzle list)
     */
    private final String serverDir;

    /**
     * The groups of audience members in this scene
     */
    private final ArrayList<PuzzleGroup> groups = new ArrayList<>();

    public PuzzleScene(String serverDir) {
        this.serverDir = serverDir;
    }

    @Override
    public void activate() {
        System.out.println("PuzzleScene activated");
        servlet.getDevices().sendMessage(Magic.PUZZLE_START);
        servlet.getDevices().sendMessage(Magic.PUZZLE_IMAGES_LIST, getPuzzleList());
    }

    @Override
    public void deactivate() {
        System.out.println("PuzzleScene deactivated");
        servlet.getDevices().sendMessage(Magic.PUZZLE_END);
    }

    @Override
    public boolean willActivate(int msg, String data) {
        switch (msg) {
            case Magic.PUZZLE_START:
                return true;
        }

        return false;
    }

    @Override
    public boolean consoleMessage(int msg, String data) {
        String[] parts;

        switch (msg) {
            case Magic.PUZZLE_START:
                String puzzleList = getPuzzleList();
                servlet.getConsoles().sendMessage(Magic.PUZZLE_IMAGES_LIST, puzzleList);
                return true;

            case Magic.PUZZLE_END:
                endScene();
                return true;

            case Magic.PUZZLE_DIVIDE_GROUPS:
                parts = data.split("#");
                if (parts[1].equals("groups")) {
                     divideByNumGroups(Integer.valueOf(parts[0]),true);
                } else if (parts[1].equals("members")) {
                    divideByNumMembers(Integer.valueOf(parts[0]), true);
                }

                return true;

            case Magic.PUZZLE_DIVIDE_POSES:
                divideByNumGroups(Integer.valueOf(data), false);
                return true;

            case Magic.PUZZLE_TEXT:
                parts = data.split("#");
                if (parts.length > 1) {
                    sendGroupPose(Integer.parseInt(parts[0]), parts[1]);
                }
                return true;

            case Magic.PUZZLE_IMAGE:
                parts = data.split("#");
                if (parts.length > 1) {
                    sendImagePuzzle(Integer.parseInt(parts[0]), parts[1]);
                }
                return true;

            case Magic.PUZZLE_CORRECT:
                groups.get(Integer.parseInt(data) - 1).setGroupCorrect();
                return true;
        }

        return false;
    }

    @Override
    public boolean deviceMessage(IDevice device, int msg, String data) {
        switch (msg) {
            case Magic.PUZZLE_CORRECT:
                setDeviceCorrect(device);
                return true;
        }
        return false;
    }

    /**
     * Divide the audience into the number of groups specified
     *
     * @param numGroups: The number of groups to divide into
     * @param colors: True to send prompts to divide audience by colors, false otherwise
     */
    public void divideByNumGroups(int numGroups, boolean colors) {
        // Clear the existing device groups
        groups.clear();

        String colorsList = ""; // Used to store colors to send to console

        // Create groups and assign them colors
        for (int group = 0; group < numGroups; group++) {
            if (group < COLOR_CUES.length) {
                int colorCue = COLOR_CUES[group];
                groups.add(new PuzzleGroup(toRGB(colorCue), colorCue));
                colorsList += toColorWord(colorCue) + "#";
            }
        }

        // Assign all audience members to a group
        List<IDevice> devices = servlet.getDevices().getConnectedDevices();
        int currentGroup = 0;

        while (!devices.isEmpty()) {
            IDevice device = devices.get(new Random().nextInt(devices.size()));
            groups.get(currentGroup).add(new PuzzleDevice(device));
            devices.remove(device);
            currentGroup = (currentGroup + 1) % groups.size();
        }

        if (colors) {
            // Send "change" cue to sound
            servlet.getAudioController().sendToSound("Some Random Pose Name");

            // Send cues to divide into groups + send colors list to console
            for (PuzzleGroup group : groups) {
                group.sendGroup();
            }

            // Send group list to console
            String groupsList = "";
            for (PuzzleGroup group : groups) {
                groupsList += toColorWord(group.getColorCue()) + "#";
                groupsList += group.getNumMembers() + "#";
            }
            servlet.getConsoles()
                    .sendMessage(Magic.PUZZLE_GROUPS_LIST, groupsList);
        }
    }

    /**
     * Divide the audience into groups with the given number of members
     *
     * @param numMembers: The number of members in each group
     * @param colors: True to send prompts to divide audience by colors, false otherwise
     */
    public void divideByNumMembers(int numMembers, boolean colors) {
        // Calculate members per group
        List<IDevice> devices = servlet.getDevices().getConnectedDevices();
        int numGroups = devices.size() / numMembers;

        // Divide normally
        divideByNumGroups(numGroups, colors);
    }

    /**
     * Send an image puzzle to a group
     *
     * @param groupNum The group this puzzle is assigned to
     * @param name The name of the puzzle to set
     */
    public void sendImagePuzzle(int groupNum, String name) {
        // Send "change" cue to sound
        servlet.getAudioController().sendToSound("Some Random Pose Name");

        clearCorrect(groupNum);
        PuzzleGroup group = groups.get(groupNum - 1);

        group.setImage(name);
        group.sendPieces();
    }

    /**
     * Set and send a text pose to a group
     *
     * @param groupNum The group this pose is assigned to
     * @param pose The pose to set
     */
    public void sendGroupPose(int groupNum, String pose) {
        // Send "change" cue to sound
        servlet.getAudioController().sendToSound("Some Random Pose Name");

        PuzzleGroup group = groups.get(groupNum - 1);
        group.setPose(pose);
        group.sendPieces();
    }

    /**
     * Tell the groups to set a given group's status to correct
     *
     * @param device The device in the group to set
     */
    public void setDeviceCorrect(IDevice device) {
        for (PuzzleGroup group : groups) {
            group.setGroupCorrect(device);
        }
    }

    /**
     * Clear the correct status of devices in the given group
     *
     * @param groupNum The group to clear
     */
    public void clearCorrect(int groupNum) {
        groups.get(groupNum - 1).clearCorrect();
    }

    /**
     * Convert the given color cue to RGB
     *
     * @param colorCue The cue to convert
     * @return colorCue's color in RGB format
     */
    public int[] toRGB(int colorCue) {
        switch (colorCue) {
            case RED_CUE:
                int[] red = {255, 0, 0};
                return red;

            case CYAN_CUE:
                int[] cyan = {0, 255, 255};
                return cyan;

            case YELLOW_CUE:
                int[] yellow = {255, 255, 0};
                return yellow;

            case MAGENTA_CUE:
                int[] magenta = {255, 0, 255};
                return magenta;

            case ORANGE_CUE:
                int[] orange = {255, 69, 0};
                return orange;

            case GREEN_CUE:
                int [] green = {0, 255, 0};
                return green;

            default:
                int[] black = {0, 0, 0};
                return black;
        }
    }

    /**
     * Convert the given color cue to a color word
     *
     * @param colorCue The cue to convert
     * @return colorCue's color in word form
     */
    public String toColorWord(int colorCue) {
        switch (colorCue) {
            case RED_CUE:
                return "red";

            case CYAN_CUE:
                return "cyan";

            case YELLOW_CUE:
                return "yellow";

            case MAGENTA_CUE:
                return "magenta";

            case ORANGE_CUE:
                return "orange";

            default:
                return "black";
        }
    }

    /**
     * Generates a list of puzzles and their sizes
     *
     * @return Puzzle list as a #-separated string
     */
    public String getPuzzleList() {
        String puzzlePath = serverDir + "/" + PUZZLE_DIR;
        File puzzles = new File(puzzlePath);
        String puzzleList = "";
        for (String puzzle : puzzles.list()) {
            // If puzzle isn't a system file, add it to the list
            if (puzzle.charAt(0) != '.') {
                puzzleList += (puzzle + "#");

                // Count the pieces in this puzzle
                File piecesDir = new File(puzzlePath + "/" + puzzle);
                int pieces = 0;

                for (String piece : piecesDir.list()) {
                    if (piece.charAt(0) != '.') {
                        pieces++;
                    }
                }

                puzzleList += (pieces + "#");
            }
        }

        // Remove extra # from the end before returning
        return puzzleList.substring(0, puzzleList.length()-1);
    }

}
