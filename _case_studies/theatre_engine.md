---
title: Theatre Engine
layout: case_study
img:
  link: "/assets/theatre_engine/splash.jpg"
  alt: "Dancers in colored t-shirts and black pants moving underneath bright spotlights"
  caption: "Photos courtesy of Alison Dobbins"
type: Undergraduate Research
field: Computer Science + Theatre
desc: "Theatre Engine is a dance performance that blends light, sound, and technology. Audiences actively influence the show, with tablets providing key prompts and movements."
stats:
  - title: Timeframe
    body: 2015 - 2018
  - title: Organization
    body: Michigan State University
  - title: Areas of Focus
    body: Software Engineering, Interaction Design
  - title: Faculty Mentors
    body: Dr. Charles Owen and Alison Dobbins
---
## Project Context
### Goals
Theatre Engine seeks to examine the role of the audience through technology. Throughout the show, the fourth wall becomes increasingly fluid as audiences and dancers interact, culminating with a group dance party in which the audience members becomes performers themselves.

### My Role
As a research assistant, I helped add features and fix bugs in the show’s software. I also designed interfaces and implemented software for a new segment of the show called Puzzle.

## Creating Puzzle
### Existing Content
Theatre Engine is structured into “activities”, from Call and Response, in which dancers mimic audience members’ movements, to Poses, in which audience members are invited onstage to dance. Each activity responds to audience interaction in real time, powered by a server running backstage.

<div class="two-col">
  {%- include image.html src="/assets/theatre_engine/callandresponse.png" alt="Dancers moving as audience members direct them with Android tablets. Underneath, a screenshot of a tablet that reads 'Your Turn (move your tablet)'" caption="'Call And Response' Activity" %}
  {%- include image.html src="/assets/theatre_engine/poses.png" alt="Dancers moving as audience members direct them with Android tablets. Underneath, a screenshot of a tablet that reads 'Your Turn (move your tablet)'" caption="'Poses' Activity" -%}
</div>

<div>
  {%- include image.html src="/assets/theatre_engine/system_diagram.png" alt="Theatre Engine system diagram" caption="Theatre Engine system diagram" -%}
</div>

### How Puzzle Works
Puzzle goes beyond existing Theatre Engine activities by requiring audience members to interact with each other, not just the show's performers. In a typical Puzzle segment, the audience is divided into groups by matching their tablet color with a spotlight on the floor. Once in groups, audience members work together to piece together an image and create a dance based on what it depicts.

<div class="two-col">
  {%- include image.html src="/assets/theatre_engine/puzzle.png" alt="Screenshots from Theatre Engine: Puzzle - from left to right, tablets display: 'Find your group' text, a photo of a pirate ship, and 'Dance this image' text" caption="Puzzle Screenshots" -%}
  {%- include image.html src="/assets/theatre_engine/uml_diagram.png" alt="Theatre Engine: Puzzle architecture diagram (click for PDF)" caption="Architecture Diagram for Puzzle's Server" href="/assets/theatre_engine/uml_diagram.pdf" -%}
</div>


### Prototyping Puzzle
Puzzle was developed iteratively, so software development needed to be flexible. Each portion of Puzzle was tested first with paper and pencil standing in for technology. If team members believed the low-fidelity version was promising, I developed software to test the concept in front of real audiences. Even after software was written, Theatre Engine continued to evolve based on audience feedback after each performance.

## Key Learnings
### Interdisciplinary Communication
While working on Theatre Engine, I had to learn both how to explain computer science concepts in layman’s terms and how to adapt theatre workflows and concepts to a software engineering environment.

### Flexible Design
No matter the context, software needs to be built with evolution in mind. Nearly every Theatre Engine show was different than the one before due to user feedback.

## More Information
[Project Website](https://msu.edu/~dobbinsa/){:.button}