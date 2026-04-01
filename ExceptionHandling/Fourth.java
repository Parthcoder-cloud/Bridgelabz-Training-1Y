
import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        System.out.println("Enter Two Number : - - - - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        try {
            int Result = n / m;
            System.out.println("Result : - - - - "+Result);
        } catch (ArithmeticException e) {
            System.out.println("if dividing by zero");
            System.out.println(e);
        } finally {
            System.out.println("Operation completed");
        }
    }
}