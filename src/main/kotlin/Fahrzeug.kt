
open class Fahrzeug(var name: String,var  model: String,var  typ: String,var  farbe: String,var preis: Double) {

fun fahrzeugVerkaufen(kunde: Kunde){

    if (kunde.budget >= preis){
        kunde.budget = kunde.budget-preis
        println("Das Fahrzeug $name wurde von ${kunde.vorname} ${kunde.nachname} gekauft")
        println("Ihr Restliches Budget beträgt: ${kunde.budget}")
    }
        else {
        println("Budget ist nicht ausreichend")
        }
}
fun probeFahrt(kunde: Kunde) {
    println("Das Fahrzeug $name wird vom Kunden ${kunde.vorname} ${kunde.nachname} Probe gefahren")
    if (kunde.alter >= 18) {

    } else {

    }
}
}