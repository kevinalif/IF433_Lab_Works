package oop_111394_KevinAlif.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Koin: ${coin.name}, Saldo: ${coin.balance}")

        val txRepo = WalletRepository<Transaction>()
        txRepo.add(Transaction("TX1001", 0.1))
        txRepo.add(Transaction("TX1002", 1.5))
    }
}