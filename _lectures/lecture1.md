---
layout: with-sidebar
index: 1
name: Introduction
released-on: "2022-09-23"
videos:
    - title: "Welcome"
      url: https://drive.google.com/file/d/1OQW-Gji89qB8WPkicO2kgzQBzyUauC7F
---

## Problem Session 1 – Introduction

_{{ page.released-on }}_

Welcome to the page for the first problem session! Each problem session will
come with a page like this that summarizes the videos you should watch and
readings you should complete **beforehand**, along with any handouts for the day
and code examples, notes, and recordings from the problem solving session.

Session plan:
- 2-3 min: Introduce instructors/staff
- 2-3 min: Say hi to the people around you
- 25 min: syllabus
    - Problem Solving Sessions, videos
    - Stepik
    - Programming
    - Exams
    - Getting Help
    - Schedule
    - Lecture 1 and 2 pages
- 20 min: pre-test (for research)

After the first lecture, there is one video to watch. You should also familiarize
yourself with the [syllabus](../syllabus.html).

The university requires us to determine which students commence academic activity. Failure to certify academic activity, may result in students being billed for unearned financial aid.

To do this automatically, we are using a survey in Canvas that every student must fill out by the end of Friday of Week 2 to ensure that they are certified.
- [First Day Survey: Tell Me About Yourself #FinAid](https://canvas.ucsd.edu/courses/39524/quizzes/117363){:target="_blank"}

Videos (to watch **after** your problem session on September 23):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Notes & Files from Pre-Lecture Videos

[Pre-Lecture 1](https://github.com/ucsd-cse12-f22/ucsd-cse12-f22.github.io/tree/main/_pre-lectures/lecture-01){:target="_blank"}

## Notes & Files from Problem Solving Session 

[8AM Lecture](https://github.com/ucsd-cse12-f22/ucsd-cse12-f22.github.io/tree/main/_lectures/lecture-01/A00){:target="_blank"}

[9AM Lecture](https://github.com/ucsd-cse12-f22/ucsd-cse12-f22.github.io/tree/main/_lectures/lecture-01/B00){:target="_blank"}

[11AM Lecture](https://github.com/ucsd-cse12-f22/ucsd-cse12-f22.github.io/tree/main/_lectures/lecture-01/C00){:target="_blank"}
