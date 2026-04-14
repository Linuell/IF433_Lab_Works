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

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf (
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop"
        4500000.0
    )
    for (item in mixedData) {
        val text = item as? String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100 // Tipe aslinya integer
    // coba cast kle string. jika gaga; (null), ganti dengan "unkwon String"
    val safeString = someObject as? String ?: "Unkwon String"
    println("Hasil cast + fallback: $safeString")
}