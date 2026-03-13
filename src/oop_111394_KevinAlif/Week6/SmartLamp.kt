package oop_111394_KevinAlif.Week6

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name menyala terang.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }
}