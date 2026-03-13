package oop_111394_KevinAlif.Week6

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name menyala dan siap menerima perintah.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}