import java.util.Scanner;
public class greatfactor {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int greatfactor = 1;
        for (int i = n-1; i>=1; i--) {
            if (n % i == 0) {
                greatfactor = i;
                break;
            }
        }
        System.out.println("GreatFactor : "+greatfactor);
    }
}