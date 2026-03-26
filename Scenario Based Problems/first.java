class Book {
    int bookId;
    String title;
    int price;

    Book(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    int calculateFine(int daysLate) {
        return daysLate * 1;
    }

    void display() {
        System.out.println("Book_Id : --- " + bookId);
        System.out.println("Book_Title : --- " + title);
        System.out.println("Book_Cost : --- " + price);
    }
}

class TextBook extends Book {
    String type;

    TextBook(int bookId, String title, int price, String type) {
        super(bookId, title, price);
        this.type = type;
    }

    @Override
    int calculateFine(int daysLate) {
        return daysLate * 2;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Book_Type : --- " + type);
    }
}
class Magazine extends Book{
    String type;
     Magazine(int bookId, String title, int price, String type) {
        super(bookId, title, price);
        this.type = type;
    }
    int calculateFine(int daysLate){
        return daysLate * 5;
    }
    void display(){
        super.display();
        System.out.println("Book_Type : - "+type);
    }
    
    }
public class first {


    public static void main(String[] args) {
        TextBook t1 = new TextBook(1211, "English", 75, "School");
        int fine = t1.calculateFine(2);
        t1.display();
        System.out.println("Fine : --- "+fine);
       Magazine m1 = new Magazine(12389, "Sucess", 23,"Magazine" );
       int fine1 = m1.calculateFine(4);
       m1.display();
       System.out.println("Fine : ------ "+fine1);
    }
}