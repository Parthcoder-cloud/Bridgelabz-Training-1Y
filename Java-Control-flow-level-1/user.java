import java.util.Scanner;
public class user {

    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            int numbers = input.nextInt();
            if (numbers <= 0) {
                break;
            }
            else{
                sum += numbers;
            }
        }
        System.out.println("Sum Of Numbers : "+sum);
    }
}