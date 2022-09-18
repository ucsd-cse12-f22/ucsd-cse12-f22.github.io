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
- 30 min: syllabus
    - Problem Solving Sessions, videos
    - zyBooks
    - Programming
    - Exams
    - Getting Help
    - Schedule
    - Lecture 1 and 2 pages
- 5 min: q/a

After the first lecture, there is one video to watch. You should also familiarize
yourself with the [syllabus](../syllabus.html).

Join the Basic Data Structures and Object-Oriented Design [Stepik texbook](https://stepik.org/course/109917/syllabus){:target="_blank"}.

Then, fill out the [Stepik ID form](https://forms.gle/rrhGj9YtaCG9tket9){:target="_blank"} by Friday, October 7th by 10pm
with your Stepik ID.

Videos (to watch **after** your problem session on September 23):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Notes & Files from Pre-Lecture Videos

[Pre-Lecture 1](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_pre-lectures/lecture-01){:target="_blank"}

## Notes & Files from Live-Lecture

[Notes](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_lectures/lecture-01){:target="_blank"}
