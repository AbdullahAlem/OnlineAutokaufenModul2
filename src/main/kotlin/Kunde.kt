
// Klasse Kunde mit Vor- und Nachname, Budget, Alter und Passwort
class Kunde(var vorname: String, var nachname: String, var budget: Double, var alter: Int, var passwort: String) {

    // Funktion Begrüßung, Kunde stellt sich vor mit Vor- und Nachnamen
   // fun begruessung() {
      //  println("Hallo ich bin: $vorname,$nachname")
    }

    //Funktion logIn


    // Funktion fahrzeugAuswahl
    fun fahrzeugAuswahl() {
        // hier soll der Kunde das Fahrzeug, welches er kaufen möchte aussuchen
        println("Suchen Sie das Fahrzeug aus, dass Sie kaufen möchten:")
    }

    // Funktion kaufAbschluss
    fun kaufAbschluss() {
        // Danksagung an den Kunden für kauf eines Fahrzeugs und Verabschiedung
        println("Vielen Dank! Das Sie sich für Golden Syntax entschieden haben ")
    }
