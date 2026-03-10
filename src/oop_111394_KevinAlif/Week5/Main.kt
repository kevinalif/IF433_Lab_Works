package oop_111394_KevinAlif.Week5

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }
    println("=== TUGAS 1: MATH HELPER (OVERLOADING) ===")
    val mathHelper = MathHelper()
    println("Luas Persegi (sisi 5): ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (4x6): ${mathHelper.hitungLuas(4, 6)}")
    println("Luas Lingkaran (jari-jari 7.0): ${mathHelper.hitungLuas(7.0)}")
    println()

    println("=== TUGAS 2: SISTEM PEMBAYARAN ===")
    val myEWallet = EWallet("Kevin", 50000.0)
    val myCreditCard = CreditCard("Kevin", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in daftarPembayaran) {
        println("-> Mencoba memproses pembayaran sebesar 75000.0")
        payment.processPayment(75000.0)

        if (payment is EWallet && payment.balance < 75000.0) {
            println("=> Saldo kurang! Melakukan auto Top Up 50000.0...")
            payment.topUp(50000.0)
            payment.processPayment(75000.0) // Coba bayar lagi
        }
        println()
    }
}
