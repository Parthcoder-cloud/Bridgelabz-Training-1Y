import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = n;
        while (i >= 1) {
            System.out.println("Counter : "+i);
            i--;
        }
    }
}