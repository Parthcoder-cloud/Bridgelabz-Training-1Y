import java.util.Scanner;
class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            System.out.println("Positive.");
        }   
        else if (n < 0) {
            System.out.println("Negative.");
        }
        else{
            System.out.println("Zero.");
        }
    }
}