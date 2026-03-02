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

    val manager = Manager("Asep", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    val developer = Developer("Dora", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}