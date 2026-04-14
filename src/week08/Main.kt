package Week06.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder= order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println ("Tujuan pengiriman: $destination")

    println("\n ==== TEST LET BLOCK ===")
    val validOrder = order(null, 250000)

    val receipt =validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invailid: Harga belum di-set!"
    println (receipt)
}