






abstract class Fooditem{
    String itemName;
    double Price;
    int Quantity;
    abstract double totalprice();

     Fooditem(String itemName,double Price,int Quantity) {
        this.itemName = itemName;
        this.Price = Price;
        this.Quantity = Quantity;
    }
    public void setitemName(String itemName){
        this.itemName = itemName;
    }
    public void setPrice(double Price){
        this.Price = Price;
    }
    public void setQuantity(int Quantity){
        this.Quantity = Quantity;
    }
    public String getitemName(){
        return itemName;
    }
    public double getPrice(){
        return Price;
    }
    public int Quantity(){
        return Quantity;
    }
    void display(){
        System.out.println("Item_Name : -- "+itemName);
        System.out.println("Total_Price : --"+totalprice());
        System.out.println("Item_Quantity : -- "+Quantity);
    }
    
}
class Veg extends Fooditem{

     Veg(String itemName,double Price,int Quantity)
    {
        super(itemName, Price, Quantity);
    }
    double totalprice(){
        return Quantity * Price;
    }
}
class Nonveg extends Fooditem{

     Nonveg(String itemName,double Price,int Quantity) {
        super(itemName, Price, Quantity);
    }
    double extra = 50;
    double totalprice(){
        return (Price + extra) * Quantity;
    }
}


public class Fourth {

    public static void main(String[] args) {
        Veg v1 = new Veg("Butter Panner Masala", 350, 2);
        Nonveg n1 = new Nonveg("Butter Chicken", 650, 2);
        v1.display();
        System.out.println();
        n1.display();
    }
}