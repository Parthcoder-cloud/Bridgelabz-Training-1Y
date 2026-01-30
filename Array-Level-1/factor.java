import java.util.Scanner;
public class factor {

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
            arr[i-1] = factor;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Factor : "+arr[i]);
        }
    }
}