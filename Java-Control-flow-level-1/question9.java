import java.util.Scanner;

public class question9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;  
        double number;        

        System.out.println("Enter numbers to sum (enter 0 to stop):");
        number = input.nextDouble();  

        while (number != 0) {          
            total += number;          
            System.out.print("Enter another number: ");
            number = input.nextDouble(); 
        }

        System.out.println("Total sum: " + total);
        input.close();
    }
}
