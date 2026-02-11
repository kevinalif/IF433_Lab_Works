package oop_111394_KevinAlif.week01

fun main() {
    // LANGKAH 2: Refactoring Variables (Checkpoint 2)
    val name = "John Thor"
    val score = 80
    println("Nama: $name, Nilai: $score")

    // LANGKAH 3: When Expression (Checkpoint 3)
    // Logika ini harus ada DI DALAM kurung kurawal main
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}