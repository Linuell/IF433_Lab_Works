package week05

class Admin (nama: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$name] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("[$name] sedang merekap data absensi mahasiswa")
    }
}