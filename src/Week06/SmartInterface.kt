package Week06

    interface SmartDevice {
        val id: String        // Abstract property [cite: 143]
        val name: String      // Abstract property [cite: 143]
    }

    interface Switchable {
        fun turnOn()          // Abstract function [cite: 144]
        fun turnOff()         // Abstract function [cite: 144]
    }

    interface Recordable {
        fun startRecord()     // Abstract function [cite: 145]
        fun stopRecord() {    // Default function [cite: 145]
            println("Perekaman dihentikan dan disimpan ke Cloud.")
        }
    }
