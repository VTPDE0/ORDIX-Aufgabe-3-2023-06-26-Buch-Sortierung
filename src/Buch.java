public class Buch {
    private String titel;                               // private Variable zur Speicherung des Buchtitels
    private String autor;
    private String buch_genre;

    public Buch(String titel, String autor, String genre) {
        this.titel = titel;                             // Initialisierung des Buchtitels mit dem übergebenen Wert
        this.autor = autor;
        this.buch_genre = genre;
    }

    // Getter- und Setter-Methoden für die Felder
    public String getBuch_genre() {
        return buch_genre;
    }
    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenre() {
        return buch_genre;
    }
}