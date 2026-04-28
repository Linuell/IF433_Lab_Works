package week10

fun main() {
    println("=== TESTGENERIC CLASS===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitsoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
}