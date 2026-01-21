import java.util.Scanner;
class countdown {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = number; i>=0; i--) {
            System.out.println("Countdown : "+i);
        }
    }    
}