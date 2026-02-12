package oop_111394_KevinAlif.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    checkSize(area)
}

// CHECKPOINT 8 & 9: Pakai '=' (Expression Body) dan pastikan cuma ADA SATU
fun checkSize(area: Double) = if (area > 100) {
    println("This is a Big Circle")
} else {
    println("This is a Small Circle")
}
