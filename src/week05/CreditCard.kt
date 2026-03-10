package week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (amount <= limit) {
            println("Pembayaran credit card berhasil")
        } else {
            println("Limit credit card tidak cukup")
        }
    }
}
