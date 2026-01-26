import java.util.Scanner;
public class harshad {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d;
        int sum = 0;
        do {
            d = n % 10;
            sum += d;
            n /= 10;
        } while (n != 0);
        System.out.println("Sum : "+sum);
        if (n % sum == 0) {
            System.out.println("Harshad Number.");
        }
        else{
            System.out.println("Not Harshad Number.");
        }
    }
}