import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class Bücherregal {
    private List<Regalfach> regalfachListe;

    public Bücherregal() {
        regalfachListe = new ArrayList<>();
    }

    public void addBuch(Buch buch) {
        String genre = buch.getBuch_genre();
        String autor = buch.getBuch_autor();
        LocalDate jahr = buch.getBuch_jahr();

        // Überprüfen, ob ein passendes Regalfach für das Buch existiert
        for (Regalfach regalfach : regalfachListe) {
            if (regalfach.passt(buch)) {
                regalfach.addBuch(buch);
                return;
            }
        }

        // Wenn kein passendes Regalfach gefunden wurde, ein neues Regalfach erstellen und das Buch hinzufügen
        Regalfach neuesRegalfach = new Regalfach(genre, autor, jahr);
        neuesRegalfach.addBuch(buch);
        regalfachListe.add(neuesRegalfach);
    }
    // Methode "findeFach" wird definiert und erwartet einen Parameter vom Typ "String" namens "genre".
    // Die Methode soll ein Regalfach zurückgeben.
    public Regalfach findeFach(String genre) {
        // Durchlaufe jedes Regalfach in der Liste regalfachListe
        for (Regalfach regalfach : regalfachListe) {
            // Überprüfe, ob das Genre des aktuellen Regalfachs mit dem gesuchten Genre übereinstimmt
            if (regalfach.getRegalfach_genre().equals(genre)) {
                return regalfach;  // Rückgabe des Regalfachs, falls das Genre mit dem gesuchten Genre übereinstimmt
            }
        }
        return null;  // Rückgabe von null, falls kein passendes Regalfach gefunden wurde
    }

    public List<Regalfach> getRegalfachListe() {
        return regalfachListe;
    }
}