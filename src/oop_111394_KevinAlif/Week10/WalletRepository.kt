package oop_111394_KevinAlif.Week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findItem(condition: (T) -> Boolean): T? {
        return items.find(condition)
    }
}