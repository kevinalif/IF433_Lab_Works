package oop_111394_KevinAlif.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}
fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("ERROR MEKANIK: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
    }
    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("ERROR MEKANIK: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    println("\n== JADWAL MAKAN SORE ==")
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}
}

