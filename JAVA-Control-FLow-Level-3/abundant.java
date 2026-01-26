import java.util.Scanner;
public class abundant {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }}
            System.out.println("Sum : "+sum);
            if (sum > n) {
                System.out.println("Abundant Number.");
            }
            else{
                System.out.println("Not Abundant Number.");
            }
    }
}