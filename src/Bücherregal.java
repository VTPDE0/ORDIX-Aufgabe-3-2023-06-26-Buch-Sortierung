import java.util.ArrayList;
import java.util.List;
class Bücherregal {
    private List<Regalfach> regalfachListe;

    public Bücherregal() {
        regalfachListe = new ArrayList<>();
    }

    public void addBuch(Buch buch) {
        String genre = buch.getGenre();

        // Überprüfen, ob ein passendes Regalfach für das Buch existiert
        for (Regalfach regalfach : regalfachListe) {
            if (regalfach.passt(buch)) {
                regalfach.addBuch(buch);
                return;
            }
        }

        // Wenn kein passendes Regalfach gefunden wurde, ein neues Regalfach erstellen und das Buch hinzufügen
        Regalfach neuesRegalfach = new Regalfach(genre);
        neuesRegalfach.addBuch(buch);
        regalfachListe.add(neuesRegalfach);
    }

    public List<Regalfach> getRegalfachListe() {
        return regalfachListe;
    }
}