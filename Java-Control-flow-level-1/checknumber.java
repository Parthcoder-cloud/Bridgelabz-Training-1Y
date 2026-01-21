import java.util.Scanner;

class checknumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();

        if (Number % 5 == 0) {
            System.out.println("The number " + Number + " is divisible by 5");
        } else {
            System.out.println("The number " + Number + " is not divisible by 5");
        }
    }    
}
