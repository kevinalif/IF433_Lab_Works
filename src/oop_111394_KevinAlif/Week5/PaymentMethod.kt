package oop_111394_KevinAlif.Week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}