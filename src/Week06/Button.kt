package Week06

class IconButton(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasi; diklik")
    }
}