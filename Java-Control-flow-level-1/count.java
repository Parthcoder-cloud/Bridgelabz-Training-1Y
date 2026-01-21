import java.util.Scanner;

public class count {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        input.close();

        while (number > 0) {
            number--;
            if (number != 0) {
                System.out.println("Count Down : "+number);
            }
        }
    }
}
