import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        do {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        } while (n != 0);
        if (original == sum) {
            System.out.println("Armstrong.");
        }
        else{
            System.out.println("Not Armstrong.");
        }
    }
}