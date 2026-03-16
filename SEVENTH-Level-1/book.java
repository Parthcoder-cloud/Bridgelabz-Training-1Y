class book {

    String title;
    String author;
    double price;

   
    book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

 
    book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {

        book b1 = new book();
        book b2 = new book("Java", "James", 500);

        b1.display();
        b2.display();
    }
}