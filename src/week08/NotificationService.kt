package Week06.week08

class NotificationService {
    fun sendEmail(emailAdress: String) {
        println("Mengirim email ke: $emailAdress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // INI AKAN ERROR: Type mismatch

        if(user.email != null) {
            //SUCCESS via Smart Cast: compiler tahu 'user.email' pasti null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidal memiliki email.")
        }
    }
}