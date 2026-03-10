package Week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable { // Mewarisi 3 Interface [cite: 159]

    override fun turnOn() {
        println("CCTV [$name] aktif.")
        startRecord() // Memanggil startRecord otomatis saat turnOn [cite: 159]
    }

    override fun turnOff() {
        println("CCTV [$name] non-aktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV [$name] memulai perekaman video...")
    }
}