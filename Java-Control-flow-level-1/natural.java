import java.util.Scanner;
public class natural {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            int sum = n * (n+1)/2;
            System.out.println("The Sum of "+n+"Natural number is"+sum);
        }
        else{
           System.out.println("The Number  "+n+" Is Not Natural number ");
        }
    }
}