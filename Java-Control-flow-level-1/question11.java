import java.util.Scanner;
public class question11 {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
            int sum = 0;
        if (n > 0) {
            while (i <= n) {
                sum += i;
                i++;
            }
        }
        int total = n*(n+1)/2;
        if (sum == total) {
            System.out.println("Both results are correct and equal");
        }
        else{
            System.out.println("There is a mismatch in results.");
        }

    }
}