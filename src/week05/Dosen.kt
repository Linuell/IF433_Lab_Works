package week05

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$name] sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    fun mengajar() {
        println("[$name] sedang mengajar mahasiswa di kelas")
    }
}