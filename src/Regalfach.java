import java.util.ArrayList;
import java.util.List;
public class Regalfach {
    private String regalfach_genre;
    private String regalfach_author;
    private List<Buch> buchListe;           // private Liste zur Speicherung der Bücher im Regalfach

    public Regalfach(String genre, String author) {
        this.regalfach_genre = genre;   // Initialisierung des Genres des Regalfachs mit dem übergebenen Wert
        this.regalfach_author = author;
        buchListe = new ArrayList<>();  // Initialisierung der Buchliste als neue leere ArrayList
    }

    public boolean passt(Buch buch) { // Prüfung, ob das Genre des übergebenen Buchs mit dem Genre des Regalfachs übereinstimmt, das gleiche mit dem Autor
        return buch.getGenre().equals(regalfach_genre) && buch.getAutor().equals(regalfach_author);
    }

    public void addBuch(Buch buch) {
        buchListe.add(buch);
    }

    public List<Buch> getBuchListe() {
        return buchListe;
    }
    public String getRegalfach_genre() {
        return regalfach_genre;
    }
    public String getRegalfach_author() {
        return regalfach_author;
    }
}