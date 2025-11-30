package org.example.lesson_1

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    val result = "%02d:%02d:%02d".format(hours,minutes,seconds)
    println(result)
}