#Lesson 32. 
Code simple browser. Go to Kotlin
https://startandroid.ru/en/lessons/523-lesson-32-code-simple-browser.html

This lesson:
- code simple browser

Last lesson we saw that, browser would be displayed with http link content if we launch intent with action = ACTION_VIEW and data = Uri object with http link. We can code simple browser by ourself. It will catch such an intent and display a web page. To do this, we will adjust Intent Filter and use WebView component.
The first layout will contain an intent launching button, and the second will contain a WebView.
