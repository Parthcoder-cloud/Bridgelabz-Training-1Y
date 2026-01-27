import java.util.Scanner;
public class question14 {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter Power : ");
        int p = input.nextInt();
        int result = 1;
        int i = 1;
        if (n > 0 && p > 0) {
            while (i <= p) {
                result *= n;
                i++;
            }
            System.out.println("Result : "+result);
        }
        else{
            System.out.println("Invalid Input .");
        }
    }
}