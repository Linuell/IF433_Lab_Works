package Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>() // List polimorfisme [cite: 164]

    fun addDevice(device: SmartDevice) {
        devices.add(device) // [cite: 165]
    }

    fun turnOffAllSwitches() {
        println("\n--- Menonaktifkan Semua Saklar ---")
        for (device in devices) {
            if (device is Switchable) { // Smart Casting (is) [cite: 166]
                device.turnOff() // [cite: 167]
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- MENGAKTIFKAN MODE KEAMANAN ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord() // [cite: 170, 171]
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan") // Casting dan panggil fungsi spesifik [cite: 172]
            }
        }
    }

}