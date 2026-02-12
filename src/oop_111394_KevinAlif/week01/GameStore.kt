package oop_111394_KevinAlif.week01

fun main() {
    val gameName = "Valorant" // Bisa kamu ganti
    val price = 150000

    println("Game: $gameName, Harga: Rp$price")
    val discount = when {
        price > 200000 -> 0.15
        price > 100000 -> 0.10
        else -> 0.0
    }
}