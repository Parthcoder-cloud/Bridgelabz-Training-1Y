import java.util.Scanner;
public class multiples {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0 && n <= 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % n == 0) {
                    System.out.println(i + " ");
                }
            }
        }
        else{
            System.out.println("Invalid.");
        }
    }
}