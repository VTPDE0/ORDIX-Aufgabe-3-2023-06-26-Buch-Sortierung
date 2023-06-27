import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Erstellen eines Bücherregals
        Bücherregal bücherregal = new Bücherregal();

        // Hinzufügen von Büchern zum Bücherregal
        Buch buch1 = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", "Fantasy");
        Buch buch2 = new Buch("Harry Potter und der Stein der Weisen", "J.K. Rowling", "Fantasy");
        Buch buch3 = new Buch("Die Verwandlung", "Franz Kafka", "Klassiker");
        Buch buch5 = new Buch("1984", "George Orwell", "Science Fiction");
        Buch buch6 = new Buch("To Kill a Mockingbird", "Harper Lee", "Klassiker");
        Buch buch7 = new Buch("The Great Gatsby", "F. Scott Fitzgerald", "Klassiker");
        Buch buch8 = new Buch("Pride and Prejudice", "Jane Austen", "Roman");
        Buch buch9 = new Buch("Sense and Sensibility", "Jane Austen", "Roman");
        Buch buch10 = new Buch("Moby-Dick", "Herman Melville", "Abenteuer");
        Buch buch11 = new Buch("The Great Gatsby", "F. Scott Fitzgerald", "Roman");
        Buch buch12 = new Buch("To Kill a Mockingbird", "Harper Lee", "Roman");
        Buch buch13 = new Buch("The Catcher in the Rye", "J.D. Salinger", "Roman");
        Buch buch14 = new Buch("Wuthering Heights", "Emily Brontë", "Roman");
        Buch buch15 = new Buch("Jane Eyre", "Charlotte Brontë", "Roman");
        Buch buch16 = new Buch("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        Buch buch17 = new Buch("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        Buch buch18 = new Buch("The Chronicles of Narnia", "C.S. Lewis", "Fantasy");
        Buch buch19 = new Buch("The Alchemist", "Paulo Coelho", "Roman");
        Buch buch20 = new Buch("Crime and Punishment", "Fyodor Dostoevsky", "Klassiker");
        Buch buch21 = new Buch("One Hundred Years of Solitude", "Gabriel García Márquez", "Roman");
        Buch buch22 = new Buch("The Picture of Dorian Gray", "Oscar Wilde", "Roman");
        Buch buch23 = new Buch("The Odyssey", "Homer", "Klassiker");
        Buch buch24 = new Buch("The Adventures of Tom Sawyer", "Mark Twain", "Abenteuer");
        Buch buch25 = new Buch("The Little Prince", "Antoine de Saint-Exupéry", "Kinderbuch");
        Buch buch26 = new Buch("The Da Vinci Code", "Dan Brown", "Thriller");
        Buch buch27 = new Buch("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
        Buch buch28 = new Buch("The Hunger Games", "Suzanne Collins", "Fantasy");
        Buch buch29 = new Buch("The Girl on the Train", "Paula Hawkins", "Thriller");
        Buch buch30 = new Buch("Gone Girl", "Gillian Flynn", "Thriller");
        Buch buch31 = new Buch("1984", "George Orwell", "Science Fiction");
        Buch buch32 = new Buch("Brave New World", "Aldous Huxley", "Science Fiction");
        Buch buch33 = new Buch("The Fault in Our Stars", "John Green", "Jugendbuch");
        Buch buch34 = new Buch("TestBuch2", "Gillian Flynn", "Thriller");
        Buch buch35 = new Buch("TestBuch3", "Homer", "Klassiker");
        Buch buch36 = new Buch("TestBuch4", "Fyodor Dostoevsky", "Klassiker");
        Buch buch37 = new Buch("TestBuch5", "Fyodor Dostoevsky", "Klassiker");
        Buch buch38 = new Buch("TestBuch6", "Emily Brontë", "Roman");
        Buch buch39 = new Buch("TestBuch7", "Fyodor Dostoevsky", "Klassiker");
        Buch buch40 = new Buch("TestBuch8", "F. Scott Fitzgerald", "Roman");

        bücherregal.addBuch(buch1);
        bücherregal.addBuch(buch2);
        bücherregal.addBuch(buch3);
        bücherregal.addBuch(buch5);
        bücherregal.addBuch(buch6);
        bücherregal.addBuch(buch7);
        bücherregal.addBuch(buch8);
        bücherregal.addBuch(buch9);
        bücherregal.addBuch(buch10);
        bücherregal.addBuch(buch11);
        bücherregal.addBuch(buch12);
        bücherregal.addBuch(buch13);
        bücherregal.addBuch(buch14);
        bücherregal.addBuch(buch15);
        bücherregal.addBuch(buch16);
        bücherregal.addBuch(buch17);
        bücherregal.addBuch(buch18);
        bücherregal.addBuch(buch19);
        bücherregal.addBuch(buch20);
        bücherregal.addBuch(buch21);
        bücherregal.addBuch(buch22);
        bücherregal.addBuch(buch23);
        bücherregal.addBuch(buch24);
        bücherregal.addBuch(buch25);
        bücherregal.addBuch(buch26);
        bücherregal.addBuch(buch27);
        bücherregal.addBuch(buch27);
        bücherregal.addBuch(buch28);
        bücherregal.addBuch(buch29);
        bücherregal.addBuch(buch30);
        bücherregal.addBuch(buch31);
        bücherregal.addBuch(buch32);
        bücherregal.addBuch(buch33);
        bücherregal.addBuch(buch34);
        bücherregal.addBuch(buch35);
        bücherregal.addBuch(buch36);
        bücherregal.addBuch(buch37);
        bücherregal.addBuch(buch38);
        bücherregal.addBuch(buch39);
        bücherregal.addBuch(buch40);



        // Ausgabe des Inhalts des Bücherregals
        List<Regalfach> regalfachListe = bücherregal.getRegalfachListe();
        for (Regalfach regalfach : regalfachListe) {
            System.out.println("Regalfach (" + regalfach.getRegalfach_genre() + ") von " + regalfach.getRegalfach_author());
            List<Buch> buchListe = regalfach.getBuchListe();
            for (Buch buch : buchListe) {
                System.out.println("- Titel: " + buch.getTitel() + " / Author: " + buch.getAutor() + " / Genre: " + buch.getGenre());
            }
            System.out.println();
        }
    }
}