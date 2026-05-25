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

    interface OrderRepository {
        fun saveOrder(itemName: String, basePrice: Double, customerType: String)
    }

    class CsvOrderRepository : OrderRepository {
        override fun saveOrder(itemName: String, basePrice: Double, customerType: String) {
            File("orders.csv").bufferedWriter().use { writer ->
                writer.append("$itemName,$basePrice,$customerType\n")
            }
        }
    }

    interface NotificationService {
        fun sendNotification(itemName: String)
    }

    class EmailNotifier : NotificationService {
        override fun sendNotification(itemName: String) {
            println("Email terkirim: pesanan $itemName telah dikonfirmasi!")
        }
    }

    class SafeOrderProcessor(
        val repo: OrderRepository,
        val notifier: NotificationService)
}