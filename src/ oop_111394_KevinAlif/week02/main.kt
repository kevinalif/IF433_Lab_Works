package oop_111394_KevinAlif.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Sistem Perpustakaan")
    print("Judul Buku: ")
    val title = scanner.nextLine()
    print("Peminjam: ")
    val borrower = scanner.nextLine()
    print("Lama Pinjam (hari): ")
    var days = scanner.nextInt()
    scanner.nextLine()
    if (days < 0) {
        days = 1
    }
    val myLoan = Loan(title, borrower, days)
    val denda = myLoan.calculateFine()
    println("\n Deskripsi")
    println("Buku: ${myLoan.bookTitle}")
    println("Total Denda: Rp $denda")
}