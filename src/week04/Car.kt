package week04

open class Car (brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    override fun honk () {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}