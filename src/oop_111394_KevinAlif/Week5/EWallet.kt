package oop_111394_KevinAlif.Week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Berhasil membayar $amount. Sisa saldo: $balance")
        } else {
            println("[$accountName - EWallet] Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top up berhasil. Saldo sekarang: $balance")
    }
}