package oop_111394_KevinAlif.Week9

import java.text.ListFormat

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores : MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88

    println("\n === TEST SET ===")
    val  uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")
}