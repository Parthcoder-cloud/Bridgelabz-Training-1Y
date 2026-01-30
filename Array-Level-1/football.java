import java.util.Scanner;
public class football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double arr[] = new double[11];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Height Of " +i+ " :");
            arr[i] = input.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean = sum / 11;
        System.out.println("Mean Height For FootBall Is : "+mean);
    }
}