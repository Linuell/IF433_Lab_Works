package oop_00000112176_CeciliaWijaya.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(  System.`in` )

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter):   ")
    val nim = scanner.next()

    scanner.nextLine()


    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim,0.0, major)
        println("Status: Pendaftaran Selesai.")
    }
    // ... (Ini kelanjutan dari baris scanner.nextLine() setelah input NIM)

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, 0.0,  major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
    //TUGAS 1
    println("\n--- SISTEM PERPUSTAKAAN ---")
    print("Judul Buku: ")
    val title = scanner.nextLine()
    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) duration = 1

    val myLoan = Loan(title, borrower, duration)
    println("Buku '${myLoan.bookTitle}' dipinjam oleh ${myLoan.borrower}")
    println("Total Denda: Rp ${myLoan.calculateFine()}")

//TUGAS 2
    println("\n--- MINI RPG BATTLE ---")
    print("Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Base Damage: ")
    val dmg = scanner.nextInt()
    val myHero = Hero(heroName, dmg)

    var enemyHp = 100 // Musuh tidak perlu class [cite: 133]

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP ${myHero.name}: ${myHero.hp} | HP Musuh: $enemyHp")
        print("Menu: 1. Serang, 2. Kabur: ")
        val action = scanner.nextInt()

        if (action == 1) {
            myHero.attack("Monster")
            enemyHp -= myHero.baseDamage

            if (enemyHp > 0) {
                val monsterDmg = (10..20).random()
                println("Monster membalas dengan $monsterDmg damage!")
                myHero.takeDamage(monsterDmg)
            }
        } else {
            println("Kamu melarikan diri...")
            break
        }
    }

    if (!myHero.isAlive()) println("Game Over... ${myHero.name} gugur.")
    else if (enemyHp <= 0) println("Victory! Monster berhasil dikalahkan.")
}





