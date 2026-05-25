package Week14

import java.io.File
class BadOrderProcessor {
    private val file = File("order.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName, $finalPrice, $customerType\n")

        println("Email terkirim: pesanan $itemName Anda telah dikonfirmasi!")
    }
}