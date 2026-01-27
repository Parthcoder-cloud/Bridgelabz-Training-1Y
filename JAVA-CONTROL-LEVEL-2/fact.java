import java.util.Scanner;
public class fact {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial Of Given Number "+n+ " Is : "+fact);
    }
}