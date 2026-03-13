package oop_111394_KevinAlif.Week6

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Perekaman video dimulai.")
    }
}