package week04

open class Car (brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    override fun accelerate () {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}