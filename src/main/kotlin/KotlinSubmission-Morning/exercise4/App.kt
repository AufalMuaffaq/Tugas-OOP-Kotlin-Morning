package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        ValidationUtil.validate("aufal",null)
        println("data valid")
    }catch (e: NullPointerException){
        println("Terjadi error : ${e.message}")
    }
}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
object ValidationUtil{
    @Throws(java.lang.NullPointerException::class)
    fun validate(username: String?, password: String?) {
        if (username.isNullOrEmpty()) {
            throw NullPointerException("Username is not valid")
        }
        if (password.isNullOrEmpty()) {
            throw NullPointerException("Password is not valid")
        }
    }

}


