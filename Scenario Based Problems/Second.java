class Order {
    int Order_Id;
    double Base_Amount;

    public Order(int Order_Id, double Base_Amount) {
        this.Order_Id = Order_Id;
        this.Base_Amount = Base_Amount;
    }

    double calculateBill() {
        return Base_Amount;
    }

    void display() {
        System.out.println("Order_Id : - - - - - - - " + Order_Id);
        System.out.println("Base_Amount : - - - - - - " + Base_Amount);
    }
}
class RegularOrder extends Order {

    RegularOrder(int Order_Id, double Base_Amount) {
        super(Order_Id, Base_Amount);
    }

    
    double calculateBill() {
        return Base_Amount;
    }
}
class PremiumOrder extends Order {

    public PremiumOrder(int Order_Id, double Base_Amount) {
        super(Order_Id, Base_Amount);
    }

   
    double calculateBill() {
        return Base_Amount * 0.8;
    }
}

public class Second {

    public static void main(String[] args) {
        double charge = 40;

        RegularOrder r1 = new RegularOrder(34562, 800);
        double bill1 = r1.calculateBill();
        double total1 = bill1 + charge;

        r1.display();
        System.out.println("Total_Bill : ----- " + total1);

        System.out.println();

        PremiumOrder p1 = new PremiumOrder(98765, 800);
        double bill2 = p1.calculateBill();
        double total2 = bill2 + charge;

        p1.display();
        System.out.println("Total_Bill : ----- " + total2);
    }
}