class Gopay :  PaymentMethod{
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay server")}

}