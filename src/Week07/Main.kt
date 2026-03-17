package Week06.Week07

fun Main (){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULER CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan Mencetak memori Hash
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 //Destructing Declaration
    println("Destructured: $userName berumur $userAge")
}