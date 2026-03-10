package Week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable { // Mewarisi SmartDevice dan Switchable [cite: 149]

    override fun turnOn() {
        println("Lampu [$name] dinyalakan.") // Implementasi deskriptif [cite: 150]
    }

    override fun turnOff() {
        println("Lampu [$name] dimatikan.") // Implementasi deskriptif [cite: 150]
    }
}