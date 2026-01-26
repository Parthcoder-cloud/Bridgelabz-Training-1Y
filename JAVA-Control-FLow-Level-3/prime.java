import java.util.Scanner;

class prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            int isPrimeFlag = 1; 

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrimeFlag = 0; 
                    break;
                }
            }

            if (isPrimeFlag == 1) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        input.close();
    }
}
