import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Erstellen eines Bücherregals
        Bücherregal bücherregal = new Bücherregal();

        // Hinzufügen von Büchern zum Bücherregal
        Buch buch1 = new Buch("The Fault in Our Stars", "John Green", "Jugendbuch", 2012);
        Buch buch2 = new Buch("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 1997);
        Buch buch3 = new Buch("To Kill a Mockingbird", "Harper Lee", "Klassiker", 1960);
        Buch buch4 = new Buch("Pride and Prejudice", "Jane Austen", "Klassiker", 1813);
        Buch buch5 = new Buch("The Great Gatsby", "F. Scott Fitzgerald", "Klassiker", 1925);
        Buch buch6 = new Buch("1984", "George Orwell", "Science Fiction", 1949);
        Buch buch7 = new Buch("The Catcher in the Rye", "J.D. Salinger", "Klassiker", 1951);
        Buch buch8 = new Buch("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);
        Buch buch9 = new Buch("The Hunger Games", "Suzanne Collins", "Jugendbuch", 2008);
        Buch buch10 = new Buch("The Da Vinci Code", "Dan Brown", "Thriller", 2003);
        Buch buch11 = new Buch("The Chronicles of Narnia", "C.S. Lewis", "Fantasy", 1950);
        Buch buch12 = new Buch("Gone Girl", "Gillian Flynn", "Thriller", 2012);
        Buch buch13 = new Buch("The Alchemist", "Paulo Coelho", "Fiction", 1988);
        Buch buch14 = new Buch("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954);
        Buch buch15 = new Buch("The Girl on the Train", "Paula Hawkins", "Thriller", 2015);
        Buch buch16 = new Buch("Brave New World", "Aldous Huxley", "Science Fiction", 1932);
        Buch buch17 = new Buch("The Maze Runner", "James Dashner", "Jugendbuch", 2009);
        Buch buch18 = new Buch("The Kite Runner", "Khaled Hosseini", "Fiction", 2003);
        Buch buch19 = new Buch("The Picture of Dorian Gray", "Oscar Wilde", "Klassiker", 1890);
        Buch buch20 = new Buch("The Help", "Kathryn Stockett", "Fiction", 2009);

        Buch buch21 = new Buch("testwiederholung The Fault in Our Stars", "John Green", "Jugendbuch", 2012);
        Buch buch22 = new Buch("testwiederholung Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 1997);
        Buch buch23 = new Buch("testwiederholung To Kill a Mockingbird", "Harper Lee", "Klassiker", 1960);
        Buch buch24 = new Buch("testwiederholung Pride and Prejudice", "Jane Austen", "Klassiker", 1813);
        Buch buch25 = new Buch("testwiederholung The Great Gatsby", "F. Scott Fitzgerald", "Klassiker", 1925);
        Buch buch26 = new Buch("testwiederholung 1984", "George Orwell", "Science Fiction", 1949);
        Buch buch27 = new Buch("testwiederholung The Catcher in the Rye", "J.D. Salinger", "Klassiker", 1951);
        Buch buch28 = new Buch("testwiederholung The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);
        Buch buch29 = new Buch("testwiederholung The Hunger Games", "Suzanne Collins", "Jugendbuch", 2008);
        Buch buch30 = new Buch("testwiederholung The Da Vinci Code", "Dan Brown", "Thriller", 2003);
        Buch buch31 = new Buch("testwiederholung The Chronicles of Narnia", "C.S. Lewis", "Fantasy", 1950);
        Buch buch32 = new Buch("testwiederholung Gone Girl", "Gillian Flynn", "Thriller", 2012);
        Buch buch33 = new Buch("testwiederholung The Alchemist", "Paulo Coelho", "Fiction", 1988);
        Buch buch34 = new Buch("testwiederholung The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954);
        Buch buch35 = new Buch("testwiederholung The Girl on the Train", "Paula Hawkins", "Thriller", 2015);
        Buch buch36 = new Buch("testwiederholung Brave New World", "Aldous Huxley", "Science Fiction", 1932);
        Buch buch37 = new Buch("testwiederholung The Maze Runner", "James Dashner", "Jugendbuch", 2009);
        Buch buch38 = new Buch("testwiederholung The Kite Runner", "Khaled Hosseini", "Fiction", 2003);
        Buch buch39 = new Buch("testwiederholung The Picture of Dorian Gray", "Oscar Wilde", "Klassiker", 1890);
        Buch buch40 = new Buch("testwiederholung The Help", "Kathryn Stockett", "Fiction", 2009);



        bücherregal.addBuch(buch1);
        bücherregal.addBuch(buch2);
        bücherregal.addBuch(buch3);
        bücherregal.addBuch(buch4);
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
            System.out.println("Regalfach (" + regalfach.getRegalfach_genre() + ") von " + regalfach.getRegalfach_author() + " Jahr: " + regalfach.getRegalfach_jahr());
            List<Buch> buchListe = regalfach.getBuchListe();
            for (Buch buch : buchListe) {
                System.out.println("- Titel: " + buch.getTitel() + " / Author: " + buch.getBuch_autor() + " / Genre: " + buch.getBuch_genre() + "/ Jahr: " + buch.getBuch_jahr());
            }
            System.out.println();
        }
    }
}