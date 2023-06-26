import java.util.ArrayList;
import java.util.List;
public class Regalfach {
    private String regalfach_genre;
    private List<Buch> buchListe;

    public Regalfach(String regalfach_genre) {
        this.regalfach_genre = regalfach_genre;
        buchListe = new ArrayList<>();
    }

    public boolean passt(Buch buch) {
        return buch.getGenre().equals(regalfach_genre);
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
}
