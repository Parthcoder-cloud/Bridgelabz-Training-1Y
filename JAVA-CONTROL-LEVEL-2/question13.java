import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {

            int multiple = number;   

            System.out.println("Multiples below 100:");

            while (multiple < 100) {
                System.out.print(multiple + " ");
                multiple += number; 
            }

        } else {
            System.out.println("Invalid input.");
        }
    }
}
