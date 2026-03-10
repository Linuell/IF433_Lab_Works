package week05

fun Main (){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referensinya adalahPegawai
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen(NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebaga Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------")
    }
}