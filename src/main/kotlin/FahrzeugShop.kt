class FahrzeugShop(var fahrzeuge: MutableList<Fahrzeug>, var kunden: MutableList<Kunde>) {


    fun fahrzeugShop() {
    }

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
}