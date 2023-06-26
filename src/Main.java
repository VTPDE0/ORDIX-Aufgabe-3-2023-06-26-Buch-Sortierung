import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Erstellen eines Bücherregals
        Bücherregal bücherregal = new Bücherregal();

        // Hinzufügen von Büchern zum Bücherregal
        Buch buch1 = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", "Fantasy");
        bücherregal.addBuch(buch1);

        Buch buch2 = new Buch("Harry Potter und der Stein der Weisen", "J.K. Rowling", "Fantasy");
        bücherregal.addBuch(buch2);

        Buch buch3 = new Buch("Die Verwandlung", "Franz Kafka", "Klassiker");
        bücherregal.addBuch(buch3);

        // Ausgabe des Inhalts des Bücherregals
        List<Regalfach> regalfachListe = bücherregal.getRegalfachListe();
        for (Regalfach regalfach : regalfachListe) {
            System.out.println("Regalfach (" + regalfach.getRegalfach_genre() + "):");
            List<Buch> buchListe = regalfach.getBuchListe();
            for (Buch buch : buchListe) {
                System.out.println("- " + buch.getTitel() + " von " + buch.getAutor());
            }
            System.out.println();
        }
    }
}