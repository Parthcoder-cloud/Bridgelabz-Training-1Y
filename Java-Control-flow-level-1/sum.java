import java.util.Scanner;

class sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter numbers :");

        while (true) {
            num = input.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum : " + sum);
        input.close();
    }
}
