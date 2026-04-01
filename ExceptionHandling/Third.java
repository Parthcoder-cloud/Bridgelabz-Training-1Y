
import java.util.Scanner;

public class Third {

    public static double calculateInterest(double amount, double rate, double year) 
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0 || year < 0) {
            throw new IllegalArgumentException("Values cannot be negative");
        }

        double interest = (amount * rate * year) / 100;
        return interest;
    }
    public static void main(String[] args) {
        System.out.println("Enter Entry : - - - - ");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        double y = sc.nextDouble();
        try {
            double Result = calculateInterest(m, n, y);
            System.out.println("RESULT : - - - - "+Result);
        } catch (IllegalArgumentException e) {
       System.out.println(e.getMessage());
        }
    }
}