package oop_111394_KevinAlif.week01

fun main() {
    val name = "John Thor"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // Panggil fungsi calculateStatus di sini [cite: 150]
    // Gunakan ${ } karena kita memanggil fungsi di dalam string
    println("Status: ${calculateStatus(score)}")
}

// Tulis fungsi ini DI LUAR main()
// Kita menggunakan '=' (Expression Body) agar lebih ringkas [cite: 147, 149]
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"