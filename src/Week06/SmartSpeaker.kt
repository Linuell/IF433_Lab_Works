package Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable { // Mewarisi SmartDevice dan Switchable [cite: 154]

    override fun turnOn() {
        println("Speaker [$name] sekarang aktif.")
    }

    override fun turnOff() {
        println("Speaker [$name] standby.")
    }

    fun playMusic(song: String) { // Fungsi spesifik [cite: 155]
        println("Memutar lagu $song dari Spotify.")
    }
}