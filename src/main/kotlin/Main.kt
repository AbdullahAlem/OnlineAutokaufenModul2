import kotlin.concurrent.thread
import kotlin.system.exitProcess

fun main() {
    var fahrzeug1: Auto = Auto(
        "Mercedes Benz", "G-Klasse", "SUV", "Schwarz", 5, 179900.00)
    var fahrzeug2: Auto = Auto("Audi", "A6", "Kombi", "Weiß", 5, 49900.00)
    var fahrzeug3: Auto = Auto("BMW", "5er", "coupe", "Dunkel Blau", 5, 99900.00)
    var fahrzeug4: Motorrad = Motorrad(
        "Harley Davidson", "StreetBob114", "Chopper/Cruiser", "Schwarz",
        19700.00, 10)
    var fahrzeug5: Motorrad = Motorrad(
        "Suzuki", "Hayabusa GSX-R1300", "Sporttourer", "Silber",
        18500.00, 10)

    var kunde1: Kunde = Kunde("Max", "Schmidt", 200000.00, 27, "123")
    var kunde2: Kunde = Kunde("Mike", "Müller", 50000.00, 33, "1234")
    var kunde3: Kunde = Kunde("Hans", "Hansen", 120000.00, 59, "abc")
    var kunde4: Kunde = Kunde("Mats", "Matsen", 20000.00, 42, "def")
    var kunde5: Kunde = Kunde("Luca", "Fritz", 17000.00, 22, "xyz")

    var fahrzeugListe: MutableList<Fahrzeug> = mutableListOf(fahrzeug1, fahrzeug2, fahrzeug3, fahrzeug4, fahrzeug5)
    var kundenListe: MutableList<Kunde> = mutableListOf(kunde1, kunde2, kunde3, kunde4, kunde5)
    var auswahlKunde1: Kunde = Kunde("Mike", "Müller", 50000.00, 33, "456")

    println("----- Willkommen bei Golden Syntax -----")

    var nameRichtig: Boolean = false
    do {
        println(" Geben Sie ihren Namen ein:")

        var name: String = readln()

        for (Kundei in kundenListe) {

            if (name == Kundei.nachname) {
                Thread.sleep(1000)

                nameRichtig = true
                auswahlKunde1 = Kundei
                break
            }
        }
        Thread.sleep(1000)
        auswahlKunde1.logIn()
    } while (nameRichtig == false)
    Thread.sleep(2000)

    println("Das ist ihr Budget was Sie zur verfügung haben:")
    println(auswahlKunde1.budget)
    println()
    Thread.sleep(2000)

    println("Möchten Sie eine Probefahrt machen,dann zeige ich ihnen die Fahrzeuge?")

    var probeFahren: String = readln()
    var probeFahrt1: Boolean = false
    if (probeFahren == "ja") {
        probeFahrt1 = true
    }
    if (probeFahrt1) {
        println("Fahrzeuggalerie: Diese Fahrzeuge bieten wir ihnen  zur Probefahrt an:")
        for (Fahrzeug in fahrzeugListe) {
            println(
                "wählen Sie ${fahrzeugListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
                        "Fahrzeug Preis:${Fahrzeug.preis}"
            )
        }

        var auswahlProbeFahrt: Int = readln().toInt()
        var fahrzeugProbeFahrt: Fahrzeug = fahrzeugListe[auswahlProbeFahrt]
        fahrzeugProbeFahrt.probeFahrt(auswahlKunde1)

    }
    println("Fahrzeuggalerie: Diese Fahrzeuge bieten wir ihnen  zum kauf an:")
    for (Fahrzeug in fahrzeugListe) {
        println(
            "wählen Sie ${fahrzeugListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
                    "Fahrzeug Preis:${Fahrzeug.preis}"
        )
    }

    println("Wählen Sie das Fahrzeug aus was Sie kaufen möchten")
    do {


        var auswahl: Int = readln().toInt()
        var richtigeAuswahl: Fahrzeug = fahrzeugListe[auswahl]

        if (richtigeAuswahl.preis <= auswahlKunde1.budget) {
            println("${richtigeAuswahl.name} ${richtigeAuswahl.model} Sie haben eine  gute Entscheidung getroffen")
            richtigeAuswahl.fahrzeugVerkaufen(auswahlKunde1)
            break
        } else {
            println("Ihr Budget reicht leider nicht aus")
            println()
            println("Wählen Sie ein anderes Fahrzeug aus ")
        }
    } while (true)
    println()
    println("Vielen Dank das Sie sich für Golden Syntax entschieden haben.")
}