// Klasse Verkäufer mit Vor- und Nachname
class Verkaeufer(var vorname: String, var nachname: String) {

    // Funktion kundeBegrüßen
    fun kundeBegruessen(kunde: String) {

        // Begrüßung des Kunden vom Verkäufer
        println("Moin Herr ${kunde} Willkommen bei Golden Syntax!")

        var verkaeufer: Verkaeufer = Verkaeufer("Marc", "Möller")
        println("Ich bin ihr Ansprechpartner ${verkaeufer.vorname} ${verkaeufer.nachname}")
        println()

        // hier wird der Kunde gefragt was für ein Fahrzeug er kaufen möchte
        println("Was für ein Fahrzeug suchen Sie?")
    }

    var kundenliste: MutableList<Kunde> = mutableListOf()

}