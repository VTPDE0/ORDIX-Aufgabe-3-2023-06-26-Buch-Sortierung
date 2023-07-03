import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Erstellen eines Bücherregals
        Bücherregal bücherregal = new Bücherregal();

        //hier bereiten wir die Daten für For-Schleife
        //
        String[] buch_titelArray = {
                "The Fault in Our Stars",
                "Harry Potter and the Sorcerer's Stone",
                "To Kill a Mockingbird",
                "Pride and Prejudice",
                "testbuch1",
                "testbuch2",
                "testbuch3",
                "testbuch4"
        };

        String[] buch_autorArray = {
                "John Green",
                "J.K. Rowling",
                "Harper Lee",
                "Jane Austen",
                "John Green",
                "J.K. Rowling",
                "Harper Lee",
                "Jane Austen",
        };

        String[] buch_genreArray = {
                "Jugendbuch",
                "Fantasy",
                "Klassiker",
                "Klassiker",
                "Jugendbuch",
                "Fantasy",
                "Klassiker",
                "Klassiker"
        };
        LocalDate[] buch_jahrArray = {
                LocalDate.of(2012, 1 ,1),
                LocalDate.of(1997,1,1),
                LocalDate.of(1960,1,1),
                LocalDate.of(1813,1,1),
                LocalDate.of(2012,1,1),
                LocalDate.of(1997,1,1),
                LocalDate.of(1960,1,1),
                LocalDate.of(1813,1,1)
                        };

        for (int i = 0; i < buch_titelArray.length; i++) {
            Buch buch = new Buch(buch_titelArray[i], buch_autorArray[i], buch_genreArray[i], buch_jahrArray[i]);
            bücherregal.addBuch(buch);
        }



        // Ausgabe des Inhalts des Bücherregals
        List<Regalfach> regalfachListe = bücherregal.getRegalfachListe();
        for (Regalfach regalfach : regalfachListe) {
            System.out.println("Regalfach (" + regalfach.getRegalfach_genre() + ") von " + regalfach.getRegalfach_author() + " Jahr: " + regalfach.getRegalfach_jahr());
            List<Buch> buchListe = regalfach.getBuchListe();
            for (Buch buch : buchListe) {
                System.out.println("- Titel: " + buch.getTitel() + " / Author: " + buch.getBuch_autor() + " / Genre: " + buch.getBuch_genre() + "/ Jahr: " + buch.getBuch_jahr());
            }
            System.out.println();
        }
    }
}