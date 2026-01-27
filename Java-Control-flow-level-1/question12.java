import java.util.Scanner;
public class question12 {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        int total = n*(n+1)/2;
        if (total == sum) {
            System.out.println("Same Result.");
        }
        else{
            System.out.println("Not Same.");
        }
    }
}