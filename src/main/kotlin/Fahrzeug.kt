// Offene Klasse Fahrzeug mit Name, Model, Typ, Farbe und Preis
open class Fahrzeug(var name: String, var model: String, var typ: String, var farbe: String, var preis: Double) {

    // Funktion fahrzeugVerkaufen
    fun fahrzeugVerkaufen(kunde: Kunde) {

        if (kunde.budget >= preis) {
            kunde.budget = kunde.budget - preis

            // hier wird das Fahrzeug das gekauft wurde ausgegeben und der Vor- und Nachname des Kunden der das
            // Fahrzeug gekauft hat

            println("Das Fahrzeug $name wurde von ${kunde.vorname} ${kunde.nachname} gekauft")
            println("Ihr Restliches Budget beträgt: ${kunde.budget}")
        } else {
            // wenn das Kundenbudget nicht ausreicht, um ein Fahrzeug zu kaufen wird ausgegeben:
            println("Budget ist nicht ausreichend")
        }
    }

    // Funktion probeFahrt
    fun probeFahrt(kunde: Kunde) {
        //hier wird ausgegeben welches Fahrzeug (Fahrzeugname) von welchem Kunden (Kunden Vor- und Nachname)
        // probegefahren wird
        println("Das Fahrzeug $name wird vom Kunden ${kunde.vorname} ${kunde.nachname} Probe gefahren")

        //wenn das Alter des Kunden 18 oder älter ist, wird das Fahrzeug probegefahren sonst keine Probefahrt
        if (kunde.alter >= 18) {

        } else {

        }
    }
}