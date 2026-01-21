import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        int fact = 1;
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial Of Given Number Is : "+fact);
    }
}