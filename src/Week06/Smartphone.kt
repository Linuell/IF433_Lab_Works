package Week06

class Smartphone : Camera, Phone {
    //Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logike Camera
        super<Phone>.turnOn() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}