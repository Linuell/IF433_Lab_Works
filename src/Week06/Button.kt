package Week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasi; diklik")
    }
}