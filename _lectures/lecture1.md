---
layout: with-sidebar
index: 1
name: Introduction/Testing
released-on: "2022-03-29"
videos:
    - title: "Welcome"
      url: https://drive.google.com/file/d/1OQW-Gji89qB8WPkicO2kgzQBzyUauC7F
    - title: "Testing/Review"
      url: https://drive.google.com/file/d/1ilj1cWlGSgQchzY0tAHP2kNp9AjSx_wR
---

## Problem Session 1 – Introduction/Testing

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
- 40 min: handout + discussion

Before the first lecture, there are two videos to watch. You should also familiarize
yourself with the [syllabus](../syllabus.html).

Please do the [Pre-test/survey](https://forms.gle/o9ivk9VMjorSU8L97){:target="_blank"} by Friday, April 1st by 10pm.

Videos (to watch **before** your problem session on March 31):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Notes & Files from Pre-Lecture Videos

[Pre-Lecture 1](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_pre-lectures/lecture-01){:target="_blank"}

[Pre-Lecture 2](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_pre-lectures/lecture-02){:target="_blank"}

## Handout

<iframe src="https://drive.google.com/file/d/1vgG27BR__kP7YFxi9_c_3ph759frNB7q/preview" width="640" height="480" allow="autoplay"></iframe>

## Notes & Files from Live-Lecture

[Notes](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_lectures/lecture-01){:target="_blank"}
