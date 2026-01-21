import java.util.Scanner;
public class fact1 {

    public static void main(String[] args) {
        int fact = 1;
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial : "+fact);
    }
}