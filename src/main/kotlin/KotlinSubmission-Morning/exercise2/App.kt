package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val nomerGenap = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            nomerGenap.add(i)
        }
    }
    println("List Bilangan Genap: $nomerGenap")

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini
     */
    val namabulan = mapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "Mar" to "Maret",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Aug" to "Agustus",
        "Sep" to "September",
        "Oct" to "Oktober",
        "Nov" to "November",
        "Dec" to "Desember"
    )
    println("List Bulan Setahun:")
    namabulan.forEach { (key, value) ->
        println("- $key adalah $value")
    }
    val bulansekarang = "November"
    val bulanlahir = "Agustus"
    println("Sekarang bulan $bulansekarang, dan saya lahir pada bulan $bulanlahir")
}



