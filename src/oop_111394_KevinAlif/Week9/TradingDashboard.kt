package oop_111394_KevinAlif.Week9

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 50, 45.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 20, -12.0, "CLOSED"),
        TradeLog("DOGEUSDT", "LONG", 10, 8.5, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 50, -25.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }