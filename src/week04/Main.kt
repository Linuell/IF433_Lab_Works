package week04

fun Main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepede Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    //Tugas
    val electricCar = ElectricCar("Tesla", 4, 80)

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}