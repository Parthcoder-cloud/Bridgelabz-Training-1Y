import java.util.Scanner;
public class question10 {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int greatfactor = 1;
        int i = n-1;
        while (i >= 1) {
            if (n % i == 0) {
                greatfactor = i;
                break;
            }
            i--;
        }
        System.out.println("GreatFactor : "+greatfactor);
    }
}