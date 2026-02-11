package oop_111394_KevinAlif.week01

fun main (args: Array<String>) {
    // REFACTOR: Ubah var menjadi val dan hapus tipe data eksplisit
    val radius = 7.0
    val pi = 3.14

    // REFACTOR: Gunakan val karena nilainya tidak berubah
    val area = pi * radius * radius

    // REFACTOR: Gunakan String Template ($) daripada tanda +
    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize (area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}