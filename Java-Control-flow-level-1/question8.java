import java.util.Scanner;
public class question8 {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println("Counter : "+i);
        }
    }
}