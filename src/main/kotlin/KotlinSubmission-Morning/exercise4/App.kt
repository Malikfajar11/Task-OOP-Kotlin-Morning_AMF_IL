package id.infinitelearning.KotlinSubmission.exercise4
import java.util.Scanner
fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val scanner = Scanner(System.`in`)
    print("Masukkan hari (Senin, Selasa, Rabu, Kamis, Jumat): ")
    val day = scanner.nextLine()
    try {
        val studySchedule = getStudySchedule(day)
        println("Jadwal belajar pada hari ${studySchedule.day}: ${studySchedule.subject}")
    } catch (e: InvalidScheduleException) {
        println("Terjadi kesalahan: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        scanner.close()
    }
}

data class StudySchedule(val day: String, val subject: String)
class InvalidScheduleException(message: String) : Exception(message)
fun getStudySchedule(day: String): StudySchedule {
    val validDays = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat")
    if (!validDays.contains(day)) {
        throw InvalidScheduleException("Hari tidak valid: $day")
    }
    return when (day) {
        "Senin" -> StudySchedule("Senin", "Algoritma")
        "Selasa" -> StudySchedule("Selasa", "Andorid")
        "Rabu" -> StudySchedule("Rabu", "Bahasa Pemrograman")
        "Kamis" -> StudySchedule("Kamis", "Pengembangan Website")
        "Jumat" -> StudySchedule("Jumat", "Seni/Hiburan")
        else -> throw IllegalStateException("Jadwal tidak dapat ditemukan untuk hari: $day")
    }
}