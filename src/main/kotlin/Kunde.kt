class Kunde(var vorname: String, var nachname: String, var budget: Double, var alter: Int, var passwort: String) {

    fun begruessung() {
        println("Hallo ich bin: $vorname,$nachname")
    }
    fun logIn() {
        do {
            println("Geben Sie ihr Passwort ein:")
            var pw: String = readln()
            if (passwort == pw) {
                Thread.sleep(2000)
                println("Erfolgreich eingeloggt")
               println()
                break
            } else {
                println("Falsches Passwort")
            }
        } while (true)
    }

    fun fahrzeugAuswahl() {
        println("Suchen Sie das Fahrzeug aus das Sie kaufen möchten:")
    }

    fun kaufAbschluss() {
        println("Vielen Dank das Sie sich für Golden Syntax entschieden haben ")
    }
}