import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");

        while (true) { 
            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            if (number <= 0) { 
                break;          
            }

            total += number;   
        }

        System.out.println("Total sum: " + total);
        input.close();
    }
}
