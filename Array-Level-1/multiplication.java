import java.util.Scanner;
public class multiplication {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * (i + 1);
        }
        System.out.println("Multiplication Table : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(+arr[i]);
        }
    }
}