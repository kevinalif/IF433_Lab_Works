package oop_111394_KevinAlif.Week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - CreditCard] Berhasil membayar $amount. Tagihan saat ini: $usedAmount")
        } else {
            println("[$accountName - CreditCard] Transaksi ditolak. Melebihi limit!")
        }
    }
}