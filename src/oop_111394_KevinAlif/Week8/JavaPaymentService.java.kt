package oop_111394_KevinAlif.Week8

object JavaPaymentService {
    fun processPayment(productId: String): String {
        return "TRX-" + productId + "-SUCCESS"
    }
}
fun checkout(product: Product) {
    val id = when (product) {
        is Electronic -> product.id
        is Clothing -> product.id
    }
    val transactionResult = JavaPaymentService.processPayment(id)
    println(transactionResult!!)
}