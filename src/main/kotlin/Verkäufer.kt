class Verkäufer(var vorname:String,var nachname:String) {
    fun kundeBegruessen(kunde: Kunde){
        println("Moin Herr $kunde.nachname Willkommen bei uns")
        println("Was genau suchen Sie")
    }
}