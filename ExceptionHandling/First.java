import java.util.InputMismatchException;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers : - - - - - ");
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } catch (Exception e) {
            System.out.println("General Error: " + e);
        }
    }
}