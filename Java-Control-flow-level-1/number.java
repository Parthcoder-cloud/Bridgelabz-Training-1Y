import java.util.Scanner;
class number {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }    
}