import java.util.Scanner;

class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month (1-12) and date (1-31):");
        int m = input.nextInt();
        int d = input.nextInt();

        
        if ((m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20)) {
            System.out.println("Spring Season");
        } else {
            System.out.println("Not Spring Season");
        }

        input.close();
    }
}
