import java.util.Scanner;
public class fizz {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        if(n > 0){
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            i++;
        }
    }
    else{
        System.out.println("InvalidInput.");
    }
    }
}