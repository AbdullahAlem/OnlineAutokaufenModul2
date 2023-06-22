import kotlin.system.exitProcess

fun main() {

    Thread.sleep(2000)
    // Begrüßung des Kunden
    println("----- Willkommen bei Golden Syntax -----")
    Thread.sleep(2000)
    var nameRichtig: Boolean = false

    var name: String = ""
    do {
        println(" Geben Sie ihren Namen ein:")
        // hier gibt der Kunde seinen Namen ein
        try {
            name = readln()
        } catch (e: Exception) {
            println("Fehler bei der Eingabe")
        }
        for (Kundei in kundenListe) {

            if (name == Kundei.nachname) {
                Thread.sleep(1000)

                nameRichtig = true
                auswahlKunde1 = Kundei
                break
            }
        }

    } while (nameRichtig == false)
    Thread.sleep(1000)

    var passWort: String
    Thread.sleep(1000)
    //do while passwort
    var passWortRichtig: Boolean = false
    do {
        println("geben Sie ihr Passwort ein")
        // hier gibt der Kunde seinen Namen ein
        passWort = readln()

        for (Kundei in kundenListe) {

            if (passWort == Kundei.passwort) {
                Thread.sleep(1000)

                passWortRichtig = true
                auswahlKunde1 = Kundei
                break
            }
        }
    } while (!passWortRichtig)


    var verkaeufer = Verkaeufer("Peter", "Möller")
    verkaeufer.kundeBegruessen(name)
    Thread.sleep(2000)

    // hier wird angegeben wie viel jeder Kunde an Budget zur Verfügung hat
    println("Das ist ihr Budget was Sie zur verfügung haben:")
    println(auswahlKunde1.budget)
    println()
    Thread.sleep(2000)

    println("Geben Sie 1 für Auto oder 2 für Motorrad ein:")
    val kundenEingabe = readln().toInt()
    var gefilterteListe = fahrzeugListe
    if (kundenEingabe == 1) {
        gefilterteListe = fahrzeugListe.filter { it is Auto }.toMutableList()
    } else if (kundenEingabe == 2) {
        gefilterteListe = fahrzeugListe.filter { it is Motorrad }.toMutableList()
        Thread.sleep(2000)
    }
    println("Das ist die Gefilterte Liste an Fahrzeugen:")
    Thread.sleep(2000)
    for (Fahrzeuge in gefilterteListe)
        println(Fahrzeuge.name)
    // hier wird der Kunde gefragt, ob er eine Probefahrt mit dem Fahrzeug machen möchte
    println("Möchten Sie eine Probefahrt machen?")
    Thread.sleep(2000)

    // hier gibt der Kunde ein, ob er eine Probefahrt machen möchte

    var probeFahren: String = readln()
    var probeFahrt1: Boolean = false
    if (probeFahren == "ja") {
        probeFahrt1 = true
    }
    Thread.sleep(2000)
    var probeGefahrenesFahrzeug: Fahrzeug? = null

    if (probeFahrt1) {
        // hier werden dem Kunden die Fahrzeuge zur Probefahrt gezeigt, welche zur Verfügung stehen
        println("Fahrzeuggalerie: Diese Fahrzeuge bieten wir ihnen  zur Probefahrt an:")


        for (Fahrzeug in gefilterteListe) {

            // Fahrzeugliste mit den Daten der Fahrzeuge zur Probefahrt
            println(
                "wählen Sie ${gefilterteListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
                        "Fahrzeug Preis:${Fahrzeug.preis}"
            )
            Thread.sleep(2000)
        }

        // hier ist die Eingabe für die Fahrzeugauswahl bei der Probefahrt
        var auswahlProbeFahrt: Int = readln().toInt()
        var fahrzeugProbeFahrt: Fahrzeug = gefilterteListe[auswahlProbeFahrt]
        fahrzeugProbeFahrt.probeFahrt(auswahlKunde1)

        Thread.sleep(2000)

        println("Möchten Sie das Fahrzeug ${fahrzeugProbeFahrt.name} kaufen?")
        if (readln() == "ja") {
            probeGefahrenesFahrzeug = fahrzeugProbeFahrt
        }

    }
    // hier werden die Fahrzeuge mit ihren Daten die zum Verkauf stehen angeboten
    if (probeGefahrenesFahrzeug == null) {

        println("Fahrzeuggalerie: Diese Fahrzeuge bieten wir ihnen  zum kauf an:")
        for (Fahrzeug in gefilterteListe) {
            println(
                "wählen Sie ${gefilterteListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
                        "Fahrzeug Preis:${Fahrzeug.preis}"
            )
            Thread.sleep(2000)
        }

        // Fahrzeugauswahl: welches Fahrzeug gekauft werden soll
        println("Wählen Sie das Fahrzeug aus was Sie kaufen möchten:")
    }
    var zaehler = 0
    do {
        var richtigeAuswahl: Fahrzeug = fahrzeug1
        if (probeGefahrenesFahrzeug == null) {
            try {
                // Eingabe für die Fahrzeugauswahl
                var auswahl: Int = readln().toInt()
                richtigeAuswahl = gefilterteListe[auswahl]
            } catch (e: Exception) {
                println("Falsche Eingabe! ")
            }
        } else {
            richtigeAuswahl = probeGefahrenesFahrzeug
            probeGefahrenesFahrzeug = null
        }
        //kunde1.fahrzeugAuswahl()
        Thread.sleep(2000)
        if (richtigeAuswahl.preis <= auswahlKunde1.budget) {

            // wenn der Kunde sich für ein Fahrzeug entschieden hat, wird ausgegeben:
            println("${richtigeAuswahl.name} ${richtigeAuswahl.model}! Sie haben eine  gute Entscheidung getroffen.")
            richtigeAuswahl.fahrzeugVerkaufen(auswahlKunde1)
            break
        } else {
            // wenn das Budget des Kunden nicht ausreichend ist, wird ausgegeben:
            // println("Ihr Budget reicht leider nicht aus")
            // println()
            // dann soll der Kunde ein anderes Fahrzeug aussuchen das vom Budget her passend ist
            println("Wählen Sie ein anderes Fahrzeug aus ")
        }

        if (auswahlKunde1.budget <= richtigeAuswahl.preis) {
            zaehler += 1
            println("Ihr Budget reicht leider nicht aus um das Fahrzeug zu kaufen")
            if (zaehler > 2) {

                gefilterteListe = fahrzeugListe
                for (Fahrzeug in gefilterteListe) {

                    // Fahrzeugliste mit den Daten der Fahrzeuge zur Probefahrt
                    println(
                        "wählen Sie ${gefilterteListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
                                "Fahrzeug Preis:${Fahrzeug.preis}"
                    )
                    Thread.sleep(2000)
                }
            }
        } else
            println("Wählen Sie ein Fahrzeug aus, das ihren Budget entspricht! ")

        Thread.sleep(2000)
    } while (true)
    println()
    // Danksagung an den Kunden für den Kauf eines Fahrzeugs und Verabschiedung
    kaufAbschluss()
}