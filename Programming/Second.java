interface Taxable {
    void calculateTax(double price);
    double getTaxDetails();
}

abstract class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    abstract double calculateDiscount();

    public void setProductId(int productId) { this.productId = productId; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setPrice(double price) { this.price = price; }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    private double taxAmount;

    Electronics(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.90; 
    }

    @Override
    public void calculateTax(double price) {
        taxAmount = price * 0.18; 
    }

    @Override
    public double getTaxDetails() {
        return taxAmount;
    }

    @Override
    void display() {
        super.display();
        double discountedPrice = calculateDiscount();
        calculateTax(discountedPrice);
        System.out.println("Price after Discount: " + discountedPrice);
        System.out.println("Tax Amount: " + getTaxDetails());
    }
}

public class Second {
    public static void main(String[] args) {
        Electronics e1 = new Electronics(101, "Laptop", 50000);

        System.out.println("----Electronics----");
        e1.display();
    }
}