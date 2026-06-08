package oop_111394_KevinAlif.Week14

import java.io.File


interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}


class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.bufferedWriter().use { writer ->
            file.appendText("$itemName, $finalPrice, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
    fun getStrategyName(): String // Tambahan pembantu untuk penulisan log tipe customer
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
    override fun getStrategyName(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90 // Diskon 10%
    override fun getStrategyName(): String = "VIP"
}

// Bot Utama yang bersih, fleksibel, dan mematuhi SOLID Design Principles
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        // Kalkulasi didelegasikan ke Strategy masing-masing (OCP)
        val finalPrice = pricingStrategy.calculate(basePrice)
        val customerType = pricingStrategy.getStrategyName()

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Menyimpan data diserahkan ke repo interface (SRP & DIP)
        repo.saveOrder(itemName, finalPrice, customerType)

        // Urusan notifikasi diserahkan ke notifier interface (SRP & DIP)
        notifier.sendNotification(itemName)
    }
}