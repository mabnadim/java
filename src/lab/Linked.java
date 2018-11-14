package lab;
import java.util.*;
class Book {
    int id, quantity;
    String name, author;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;

    }
}
public class Linked {

    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<Book>();

        Book b1 = new Book(211, "Data Structure", "PCIU", 10);
        Book b2 = new Book(212, "Digital Logic Design", "PCIU", 8);
        Book b3 = new Book(213, "Linear Algebra", "PCIU", 20);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("There is the list of books store in library:\n");
        //System.out.println("ID  " + "     NAME         " + "AUTHOR " + "         QTY.");
        for (Book b : list) {
            System.out.println("ID: "+ b.id +", "+"NAME: "+ b.name +", "+"AUTHOR: "+ b.author +", "+"QTY: "+ b.quantity);
        }
    }
}
