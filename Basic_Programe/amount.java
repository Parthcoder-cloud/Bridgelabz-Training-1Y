import java.util.Scanner;
public class amount {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Quantity : ");
        Scanner input = new Scanner(System.in);
        int Quantity = input.nextInt();
        System.out.println("Enter Unit_Price : ");
        int Unit_Price = input.nextInt();
        input.close();
        int cost = Quantity * Unit_Price;
        System.out.println("Total Amount : "+cost);
    }
}
