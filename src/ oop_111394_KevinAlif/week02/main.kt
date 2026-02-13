package oop_111394_KevinAlif.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("---APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("masukkkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        println("Pilih Jalur Pendaftaran:")
        println("1. Reguler (Isi Jurusan)")
        println("2. Umum (Jurusan Otomatis 'Non-Matriculated')")
        print("Pilihan Anda (1/2): ")

        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            // JALUR 1: Input manual
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

        } else if (type == 2) {
            // JALUR 2: Pakai Default Argument
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}