package oop_111394_KevinAlif.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("MINI RPG BATTLE")
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()
    val hero = Hero(name, damage)

    var enemyHp = 100
    println("Musuh muncul dengan HP: $enemyHp")
    println("Battle Start!")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nGILIRAN ANDA")
        println("Hero HP: ${hero.hp} | Enemy HP: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih Aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Monster Jahat")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Musuh terkena ${hero.baseDamage} damage! Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                println("\n GILIRAN MUSUH")
                val enemyDamage = (10..20).random()
                println("Musuh membalas serangan!")
                hero.takeDamage(enemyDamage)
            }

        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur dari pertarungan...")
            break

        } else {
            println("Aksi tidak valid, giliran terlewat!")
        }
    }
    println("\n PERTARUNGAN TELAH SELESAI!!!")
    if (enemyHp <= 0) {
        println("SELAMAT! ${hero.name} menang! Musuh telah dikalahkan.")
    } else if (!hero.isAlive()) {
        println("GAME OVER... ${hero.name} telah gugur dalam pertarungan.")
    } else {
        println("Pertarungan tidak selesai (Kabur).")
    }
}