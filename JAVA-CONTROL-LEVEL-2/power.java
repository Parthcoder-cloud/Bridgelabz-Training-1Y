import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter Power : ");
        int p = input.nextInt();
        int result = 1;
        if (n > 0 && p > 0) {
            for (int i = 1; i <= p; i++) {
                result *= n;
            }
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println("Result : "+result);
    }
}