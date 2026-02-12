package oop_111394_KevinAlif.week01

fun main() {
    val gameName = "Valorant"
    val price = 150000

    // CHECKPOINT 11: Logic diskon menggunakan When
    val discount = when {
        price > 200000 -> 0.15
        price > 100000 -> 0.10
        else -> 0.0
    }

    val total = price - (price * discount).toInt()

    println("--- Game Store ---")
    println("Game: $gameName")
    println("Harga Asli: Rp$price")
    println("Diskon: ${(discount * 100).toInt()}%")
    println("Total Bayar: Rp$total")

    // CHECKPOINT 12: Memanggil fungsi kategori
    println("Kategori: ${getCategory(price)}")
}

// CHECKPOINT 12: Fungsi dengan Expression Body
fun getCategory(price: Int) = when {
    price >= 500000 -> "AAA Game"
    price > 0 -> "Indie Game"
    else -> "Free to Play"
}