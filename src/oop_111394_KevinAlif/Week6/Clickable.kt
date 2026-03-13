package oop_111394_KevinAlif.Week6

    interface Clickable  {
        val name: String
        fun click()
    }

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}