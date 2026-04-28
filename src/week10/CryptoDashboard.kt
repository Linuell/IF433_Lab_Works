package week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 5.70))
    coinRepo.add(Coin("USDT", 1200.00))

    val response = ApiResponse("200 OK", coinRepo.getAll())
}