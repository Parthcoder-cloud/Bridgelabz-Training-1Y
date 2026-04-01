import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        System.out.println("Enter Size Of Array : - - - - ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Index : - - ");
        int index = sc.nextInt();

        System.out.println("Enter divisor : - - ");
        int divisor = sc.nextInt();

        try {
            int value = arr[index];  

            int result = value / divisor;
            System.out.println("Result : - - " + result);

        } catch (ArithmeticException e) {
            System.out.println("If dividing by zero");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds.");
        }
    }
}