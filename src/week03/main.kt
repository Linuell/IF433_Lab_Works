package week03

fun main () {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}");

//tugas1
    val sword = Weapon("Dragon Slayer")

    sword.damage = -50
    sword.damage = 9999

    println("Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    //tugas 2
    val player = Player("Cecil")

    player.addXp(50)

    player.addXp(60)
}
