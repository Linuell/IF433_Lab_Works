package Week06

interface Clickable {
    val name: String
    fun click()
}

// PERHATIKAN: Tidak boleh ada () setelah Clickable
class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}