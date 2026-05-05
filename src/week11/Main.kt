package week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run; $result")

    val homeDevices = mutableListOf<SmartDevice>()

    val lamp = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device // return object
    }
    homeDevices.add(acUnit)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }
    with(homeDevices) {
        println("=== DASHBOARD SUMMARY ===")
        println("Total Perangkat Terdaftar: ${this.size}")
    }
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total Konsumsi Daya: $totalPower Watt")

    println("\n=== DETAIL DIAGNOSTIK PERANGKAT ===")
    homeDevices.forEach {
        println(it.diagnose())
    }
}


