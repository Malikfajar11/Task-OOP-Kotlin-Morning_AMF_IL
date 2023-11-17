
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

    val firstName: String = "Abdul Malik"
    val lastName: String = "Fajar"
    val age: Int = 22
    val isSingle: Boolean = false

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}
/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("Group ID: $groupId")
    println("Group Members:")
    groupMember.forEachIndexed { index, member ->
        println("${index + 1}. $member")
    }
    println("Session: $session")
    return ""
}
fun groupDetail() {

    val groupId = "Logic Liberators"
    val members = listOf("Abdul Malik Fajar", "Dicki mahfud Fauzi", "Fathiiya Anandita",
        "Putu Ardika Wijaya", "M. Malik Aziz AL Kutbi", "Tengku Muhammad Zainul Aprilizar" ,
        "Marissa Ana" , "Farida Ikha Salsabila" , "Hafizhul Wahid" , "Ahmad Malik Baehaqi")
    val session = "Morning Session"

    groupDetail(groupId, members, session)
}
/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val teamName = listOf("Abdul Malik Fajar", "Dicki mahfud Fauzi", "Fathiiya Anandita",
                                         "Putu Ardika Wijaya", "M. Malik Aziz AL Kutbi", "Tengku Muhammad Zainul Aprilizar" ,
                                         "Marissa Ana" , "Farida Ikha Salsabila" , "Hafizhul Wahid" , "Ahmad Malik Baehaqi")
    val myName = teamName[0]
    println("Nama Saya: $myName")
    return teamName
}
fun mainteam() {

    val team = myTeam()
    println(message = "Daftar Anggota Tim:")
    team.forEachIndexed { index, member ->
        println("${index + 1}. $member")
    }
}
/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

fun totalMember(): Int {

    val mentor = arrayOf<String>("Kak Syarif", "Kak jessica", "Kak Hasan","Kak Shania", "Kak Kelvin", "Kak Ifan")
    val countOfGroup = arrayOf<String>("Malik Fajar", "Dicki Fauzi", "Fathiiya",
        "Putu Wijaya","Malik Aziz","Tengku Aprilizar","Marissa","Farida Ikha","Hafizhul","Malik Baehaqi")
    val totalMember = mentor.size + countOfGroup.size
    return totalMember
}

fun main() {

    myProfile()
    val myTeam = myTeam()
    println("Anggota Tim  : $myTeam")
    val totalMember = totalMember()
    println("Total Member : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    groupDetail("Logic.Liberators",
        listOf("Malik Fajar", "Dicki Fauzi", "Fathiiya", "Putu Wijaya","Malik Aziz","Tengku Aprilizar","Marissa","Farida Ikha","Hafizhul","Malik Baehaqi"),
        "Morning Session")

}