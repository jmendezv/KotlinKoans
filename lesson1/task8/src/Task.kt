fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    if (client == null || message == null) return

    // if (client != null) client.personalInfo else return
    val personalInfo: PersonalInfo = client.personalInfo ?: return

    // if (personalInfo.email != null) personalInfo.email else return
    val email: String = personalInfo.email ?: return

    mailer.sendMessage(email, message)
}

data class Client (val personalInfo: PersonalInfo?)
data class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
