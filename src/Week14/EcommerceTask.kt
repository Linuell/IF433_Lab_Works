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
        val notifier: NotificationService
    ) {
        fun processOrder(
            itemName: String,
            basePrice: Double,
            strategy: PricingStrategy
        ) {
            val finalPrice = strategy.calculate(basePrice)
            println("Memproses pesanan $itemName seharga $finalPrice")
            repo.saveOrder(itemName, finalPrice, strategy::class.simpleName ?: "Unknown")
            notifier.sendNotification(itemName)
        }
    }

    interface PricingStrategy {
        fun calculate(price: Double): Double
    }

    class VipPricing : PricingStrategy {
        override fun calculate(price: Double): Double {
            return price * 0.90
        }
    }

    class RegularPricing : PricingStrategy {
        override fun calculate(price: Double): Double {
            return price
        }
    }

    fun main() {
        val processor = SafeOrderProcessor(
            CsvOrderRepository(),
            EmailNotifier()
        )
        processor.processOrder(
            "Laptop", 1000000.0, VipPricing()
        )
    }
}