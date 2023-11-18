package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namadepan: String = "Aufal"
    val namabelakang: String = "Muaffaq"
    val umur: Number = 23
    val status: Boolean = true

    println("Nama Depan: $namadepan")
    println("Nama Belakang: $namabelakang")
    println("Umur: $umur")
    println("Single: $status")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println(groupId)
    groupMember.forEach {
        println(it)
    }
    println(session)
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */

fun myTeam(): List<String> {
    var group: List<String> = listOf(
        "Aufal", "fahri", "irma","fadli","ihsan", "alif","farhan","alif","raka","fikri"
    )

    val namaSaya = group.get(0)
    println("nama saya: $namaSaya")

    return group
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Megy", "Kak Syarif")
    val countOfGroup = arrayOf<String>(
        "aufal", "fahri", "irma","fadli","ihsan", "alif","farhan","alif","raka","fikri"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()
    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Baldwin", myTeam(), "morning")

}