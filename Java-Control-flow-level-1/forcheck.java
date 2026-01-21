import java.util.Scanner;

public class forcheck {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Enter only natural numbers");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
        int formula = n * (n+1)/2;
        System.out.println("Sum : "+formula);
        if (sum == formula) {
            System.out.println("Same Result.");
        }
        else{
            System.out.println("Not Same.");
        }
    }
}
