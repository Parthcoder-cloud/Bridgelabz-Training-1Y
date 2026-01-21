import java.util.Scanner;
class vote {
    public static void main(String[] args) {
        System.out.println("Enter Your Age : ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You Can Vote.");
        }
        else{
            System.out.println("You Can't Vote.");
        }
    }    
}