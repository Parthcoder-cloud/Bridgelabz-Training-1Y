import java.util.Scanner;
public class question1 {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(+i+ " Is Even Number .");
            }
             else{
            System.out.println(+i+ " Is Odd Number.");
        }
        }
    }
}