class Product {
    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}

class ElectronicProduct extends Product {
    String brand;

    ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    @Override
    boolean isMatch(String keyword) {
        String key = keyword.toLowerCase();
        return productName.toLowerCase().contains(key) ||
               brand.toLowerCase().contains(key);
    }
}

public class Four{
    public static void main(String[] args) {
        Product p1 = new Product(101, "Office Chair");
        ElectronicProduct e1 = new ElectronicProduct(102, "Smartphone", "Samsung");

        System.out.println(p1.isMatch("chair"));
        System.out.println(e1.isMatch("smart"));
        System.out.println(e1.isMatch("samsung"));
    }
}