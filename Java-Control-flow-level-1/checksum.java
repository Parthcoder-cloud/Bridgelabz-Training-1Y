import java.util.Scanner;

public class checksum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Error! Enter a natural number greater than 0.");
        } else {
            
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

           
            int formulaSum = n * (n + 1) / 2;

           
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula n*(n+1)/2: " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both results are equal ✅");
            } else {
                System.out.println("Results are different ❌");
            }
        }

        input.close();
    }
}
