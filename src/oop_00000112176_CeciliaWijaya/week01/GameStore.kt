package oop_00000112176_CeciliaWijaya.week01

fun main() {
    val gameTitle = "SteamKW"
    val price = 750000
    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice, price = price)
}

fun calculateDiscount(price: Int) =
    if (price >500000) price *80 / 100 else price * 90/ 100
fun printReceipt(title: String, finalPrice: Int) {
    println("Judul: $finalPrice")
}
