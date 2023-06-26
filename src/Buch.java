public class Buch {
    private String titel;
    private String autor;
    private String buch_genre;

    public Buch(String titel, String autor, String genre) {
        this.titel = titel;
        this.autor = autor;
        this.buch_genre = genre;
    }

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
