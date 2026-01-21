import java.util.Scanner;
class smallest {
    public static void main(String[] args) {
        System.out.println("Enter First Number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter Second Number : ");
        int b = input.nextInt();
        System.out.println("Enter Third Number : ");
        @SuppressWarnings("unused")
        int c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        }
        else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        }
        else if (c > a && c > b) {
            System.out.println("c is greater than a and b");
        }
    }    
}