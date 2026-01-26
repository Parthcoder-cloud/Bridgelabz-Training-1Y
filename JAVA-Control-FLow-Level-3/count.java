import java.util.Scanner;
public class count {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        do {
            n /= 10;
            count++;
        } while (n != 0);
        System.out.println("Count : "+count);
    }
}