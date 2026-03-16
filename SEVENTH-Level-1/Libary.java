import java.util.Scanner;

class Libary {

    String title;
    String author;
    double price;
    boolean available = true;

    Libary(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Libary b = new Libary(title, author, price);

        b.display();

        System.out.println("\nBorrowing Book...");
        b.borrowBook();

        System.out.println("Borrowing Again...");
        b.borrowBook();
    }
}