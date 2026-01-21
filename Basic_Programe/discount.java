import java.util.Scanner;
public class discount {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Fees : ");
        Scanner input = new Scanner(System.in);
        int Fees = input.nextInt();
        input.close();
        int discount = (10 * Fees)/100;
        int s_p = Fees - discount;
        System.out.println("Discount : "+discount);
        System.out.println("Final Payment : "+s_p);
}
}