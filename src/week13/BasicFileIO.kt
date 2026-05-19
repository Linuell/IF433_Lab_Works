package week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialasi sistem.\n")
    println("File berhasil dibuat dan ditulis")

}