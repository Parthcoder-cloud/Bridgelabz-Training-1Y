import java.util.Scanner;
public class fees {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[]args){
        System.out.println("Enter Collage Fees : ");
        Scanner input = new Scanner(System.in);
        int fees = input.nextInt();
        input.close();
         int discount = (10 * fees)/100;
        int s = fees - discount;
        System.out.println("Discount : "+discount);
        System.out.println("Total Fees : "+s);
    }
}