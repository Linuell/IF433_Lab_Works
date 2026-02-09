package oop_00000112176_CeciliaWijaya.week01

fun main() {
    val gameTitle = "SteamKW"
    val price = 750000
    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int) =
    if (price >500000) price *80 / 100 else price * 90/ 100
