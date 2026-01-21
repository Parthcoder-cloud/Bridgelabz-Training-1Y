import java.util.Scanner;

public class remainder {
@SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Two Numbers : ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int quotient = a / b;    // Division
        int remainder = a % b;   // Modulus

        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);

        input.close();
    }
}
