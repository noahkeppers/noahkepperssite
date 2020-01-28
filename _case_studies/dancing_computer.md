---
title: Dancing Computer
layout: case_study
img:
  link: "/assets/dancing_computer/splash.jpg"
  alt: "A small child dances on a brightly colored floor as Matt looks on"
  caption: "Photos courtesy of Alison Dobbins"
type: Undergraduate Research
field: Computer Science + Education
desc: "Dancing Computer explores a reading-first approach to coding using STEAM (STEM + Art) education. Students embody computers as they “execute” dances on a gridded floor."
stats:
  - title: Timeframe
    body: Summer 2016
  - title: Organization
    body: Michigan State University
  - title: Areas of Focus
    body: Software Engineering, Instructional Design
  - title: Faculty Mentors
    body: Dr. Charles Owen, Alison Dobbins, and Dr. Laura Dillon
---
## Project Context
### Goals
Dancing Computer seeks to explore a new method of teaching students to program. Using movement and dance, students learn to read simple computer programs and understand concepts such as variables and control flow.

### My Role
Over the course of the summer, I worked with the research team to design teaching software and facilitate Dancing Computer sessions. In August, I helped present our findings and contributed toward a research paper.

## Dancing Computer Sessions
### Structure
Over several weeks, I worked with the Dancing Computer team to facilitate hands-on programming sessions for children at the Impression 5 Science Museum. At the beginning of each class, I worked with other research assistants to teach students dance steps. After this pre-teaching segment, we helped students perform step-by-step dances in small groups. Students read dance steps off an Android tablet and "execute" them sequentially, just like a computer executes commands in a program.

<div class="two-col">
  {%- include image.html src="/assets/dancing_computer/dc1.png" alt="Two students stand facing each other on a brightly colored floor, reading instructions from tablets in their hands. Underneath, a screenshot of a tablet displays a puzzle piece with 'crouch forward 2' conveyed in pictographs." caption="Students participate in the Dancing Computer activity in groups" %}
  {%- include image.html src="/assets/dancing_computer/dc2.png" alt="Two groups of students stand on a brightly colored floor, reaching toward the sky with tablets in their hands. Underneath, a screenshot of a tablet displays a puzzle piece with 'grow counter-clockwise 90' in pictographs." caption="Dances range from small (4 students) to larger groups (8 students)" -%}
</div>

### The Tech
Dancing Computer is powered by a desktop server that controls the sequence and pacing of dance steps. After each step, the correct position for each student is displayed on-screen, allowing facilitators to gently correct any mis-steps.

<div class="two-col">
  {%- include image.html src="/assets/dancing_computer/dcserver.png" alt="Screenshot from the Dancing Computer server - the window displays a list of dance steps and a small window denoting each dancer's position on the colored floor" caption="Dancing Computer's server software" -%}
  {%- include image.html src="/assets/dancing_computer/diagram.png" alt="Dancing Computer system diagram" caption="Dancing Computer system diagram" -%}
</div>

### Debriefing
After each session, team members debriefed with faculty to discuss where students struggled and develop any necessary curriculum changes. Each session was recorded and coded to determine how students' speed and error rates changed as they spent time dancing. 


## The Variables Feature
### Teaching Variables
At the beginning of the summer, the Dancing Computer server could only model simple programs - simple lists of dance steps to be read in order. My teammates and I developed features to teach another core computing principle: data storage. This required introducing a new dance step to set a variables ("X = 2") and allowing use of variables in existing steps ("Walk X steps").

### Quizzes
My work focused on implementing quizzes to check students' understanding. After each variable assignment, students must enter the new value correctly before they could move to the next step.

<div>
  {%- include image.html src="/assets/dancing_computer/variables.png" alt="Screenshots showing the variables feature - from left to right, tablets display: 'Move forward X, X: 3', 'X = X - 2, X: 3' with a space underneath to enter a value of X, 'X = X - 2, X: 3' (as before) with examples of incorrect input (X = 4, colored red) and correct input (X = 1, colored green)" caption="Use of variables in dance steps" -%}
</div>

## Key Learnings
### Scaffolding & Instructional Design
Writing software for Dancing Computer helped me learn about learning. Structuring lessons that build on each other at a comfortable pace is challenging. Too fast, and students get frustrated. Too slow, and students get bored.

### The Curse of Knowledge
As someone with programming experience, I often had no idea how difficult a given topic would be for students to grasp. This made student feedback an incredibly important source of insight when judging the curriculum's effectiveness.

## More Information
[Project Website](https://cse.msu.edu/dance/){:.button}
[Research Poster](/assets/dancing_computer/dc-poster.pdf){:.button}
[Research Paper](https://www.emerald.com/insight/content/doi/10.1108/IJPCC-02-2017-0012/full/html){:.button}