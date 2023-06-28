public class Buch {
    private String titel;                               // private Variable zur Speicherung des Buchtitels
    private String buch_autor;
    private String buch_genre;

    private int buch_jahr;

    public Buch(String titel, String autor, String genre, int jahr) {
        this.titel = titel;                             // Initialisierung des Buchtitels mit dem übergebenen Wert
        this.buch_autor = autor;
        this.buch_genre = genre;
        this.buch_jahr = jahr;
    }

    // Getter- und Setter-Methoden für die Felder
    public String getBuch_genre() {
        return buch_genre;
    }
    public String getTitel() {
        return titel;
    }

    public String getBuch_autor() {
        return buch_autor;
    }

    public int getBuch_jahr() {
        return buch_jahr;
    }
}