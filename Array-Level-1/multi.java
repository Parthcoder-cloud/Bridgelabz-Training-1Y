import java.util.Arrays;
import java.util.Scanner;
public class multi {
    public static void main(String[] args) {
        System.out.println("Enter Row Size : ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        System.out.println("Enter Column Size : ");
        int Column = input.nextInt();
        int arr[][] = new int[row][Column];
        for ( int i = 0; i < Column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Enter Element At Index  ["+i+"]["+j+"]  :" );
                arr[i][j] = input.nextInt();
            }
        }
        int[] array = new int[row * Column];
       int k = 0;
       for (int i = 0; i < row; i++) {
        for (int j = 0; j < Column; j++) {
            array[k] = arr[i][j];
                k++;
        }
       }
       for (int i = 0; i < row; i++) {
         System.out.println(Arrays.toString(arr[i]));
       }
       System.out.println("\nConverted 1D Array:");
        System.out.println(Arrays.toString(array));
    }
}