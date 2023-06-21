var fahrzeug1: Auto = Auto(
 "Mercedes Benz", "G-Klasse", "SUV", "Schwarz", 5, 179900.00
)
var fahrzeug2: Auto = Auto("Audi", "A6", "Kombi", "Weiß", 5, 49900.00)
var fahrzeug3: Auto = Auto("BMW", "5er", "coupe", "Dunkel Blau", 5, 99900.00)
var fahrzeug4: Motorrad = Motorrad(
 "Harley Davidson", "StreetBob114", "Chopper/Cruiser", "Schwarz",
 19700.00, 10
)
var fahrzeug5: Motorrad = Motorrad(
 "Suzuki", "Hayabusa GSX-R1300", "Sporttourer", "Silber",
 18500.00, 10
)

// Das sind die Kunden mit Vor- und Nachnamen, Budget, Alter und ihr Passwort zum Einloggen
var kunde1: Kunde = Kunde("Max", "Schmidt", 200000.00, 27, "123")
var kunde2: Kunde = Kunde("Mike", "Müller", 50000.00, 33, "1234")
var kunde3: Kunde = Kunde("Hans", "Hansen", 120000.00, 59, "abc")
var kunde4: Kunde = Kunde("Mats", "Matsen", 20000.00, 42, "def")
var kunde5: Kunde = Kunde("Freddy", "Fritz", 19000.00, 22, "xyz")

// Fahrzeugliste
var fahrzeugListe: MutableList<Fahrzeug> = mutableListOf(fahrzeug1, fahrzeug2, fahrzeug3, fahrzeug4, fahrzeug5)
// Kundenliste
var kundenListe: MutableList<Kunde> = mutableListOf(kunde1, kunde2, kunde3, kunde4, kunde5)
var auswahlKunde1: Kunde = Kunde("Mike", "Müller", 50000.00, 33, "456")

fun test() {



 Thread.sleep(2000)
 // Begrüßung des Kunden
 println("----- Willkommen bei Golden Syntax -----")
 Thread.sleep(2000)
 var nameRichtig: Boolean = false
 do {

  println(" Geben Sie ihren Namen ein:")
  // hier gibt der Kunde seinen Namen ein
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

 } while (nameRichtig == false)
 Thread.sleep(2000)


 var verkaeufer = Verkaeufer("Marc", "Möller")
 verkaeufer.kundeBegruessen("Schmidt")

 Thread.sleep(2000)
 // hier wird angegeben wie viel jeder Kunde an Budget zur Verfügung hat
 println("Das ist ihr Budget was Sie zur verfügung haben:")
 println(auswahlKunde1.budget)
 println()
 Thread.sleep(2000)


 // hier wird der Kunde gefragt, ob er eine Probefahrt mit dem Fahrzeug machen möchte
 println("Möchten Sie eine Probefahrt machen,dann zeige ich ihnen die Fahrzeuge?")
 Thread.sleep(2000)

 // hier gibt der Kunde ein, ob er eine Probefahrt machen möchte
 var probeFahren: String = readln()
 var probeFahrt1: Boolean = false
 if (probeFahren == "ja") {
  probeFahrt1 = true
 }
 Thread.sleep(2000)
 if (probeFahrt1) {
  // hier werden dem Kunden die Fahrzeuge zur Probefahrt gezeigt, welche zur Verfügung stehen
  println("Fahrzeuggalerie: Diese Fahrzeuge bieten wir ihnen  zur Probefahrt an:")

  for (Fahrzeug in fahrzeugListe) {

   // Fahrzeugliste mit den Daten der Fahrzeuge zur Probefahrt
   println(
    "wählen Sie ${fahrzeugListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
            "Fahrzeug Preis:${Fahrzeug.preis}"
   )
   Thread.sleep(2000)
  }

  // hier ist die Eingabe für die Fahrzeugauswahl bei der Probefahrt
  var auswahlProbeFahrt: Int = readln().toInt()
  var fahrzeugProbeFahrt: Fahrzeug = fahrzeugListe[auswahlProbeFahrt]
  fahrzeugProbeFahrt.probeFahrt(auswahlKunde1)

  Thread.sleep(2000)
 }
 // hier werden die Fahrzeuge mit ihren Daten die zum Verkauf stehen angeboten
 println("Fahrzeuggalerie: Diese Fahrzeuge bieten wir ihnen  zum kauf an:")
 for (Fahrzeug in fahrzeugListe) {
  println(
   "wählen Sie ${fahrzeugListe.indexOf(Fahrzeug)} für  ${Fahrzeug.name},model:${Fahrzeug.model} " +
           "Fahrzeug Preis:${Fahrzeug.preis}"
  )
  Thread.sleep(2000)
 }

 // Fahrzeugauswahl: welches Fahrzeug gekauft werden soll
 println("Wählen Sie das Fahrzeug aus was Sie kaufen möchten")
 do {


  // Eingabe für die Fahrzeugauswahl
  var auswahl: Int = readln().toInt()
  var richtigeAuswahl: Fahrzeug = fahrzeugListe[auswahl]
  //kunde1.fahrzeugAuswahl()
  Thread.sleep(2000)
  if (richtigeAuswahl.preis <= auswahlKunde1.budget) {

   // wenn der Kunde sich für ein Fahrzeug entschieden hat, wird ausgegeben:
   println("${richtigeAuswahl.name} ${richtigeAuswahl.model} Sie haben eine  gute Entscheidung getroffen")
   richtigeAuswahl.fahrzeugVerkaufen(auswahlKunde1)
   break
  } else {
   // wenn das Budget des Kunden nicht ausreichend ist, wird ausgegeben:
   println("Ihr Budget reicht leider nicht aus")
   println()
   // dann soll der Kunde ein anderes Fahrzeug aussuchen das vom Budget her passend ist
   println("Wählen Sie ein anderes Fahrzeug aus ")
  }
  Thread.sleep(2000)
 } while (true)
 println()
 // Danksagung an den Kunden für den Kauf eines Fahrzeugs und Verabschiedung
 // println("Vielen Dank! Das Sie sich für Golden Syntax entschieden haben.")


 }