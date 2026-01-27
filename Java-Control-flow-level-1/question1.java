import java.util.Scanner;
class question1 {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 5 == 0) {
            System.out.println(+n+ " is divisible by 5.");
        }
        else{
            System.out.println(+n+ " is not divisible by 5");
        }
    }    
}