import java.util.Scanner;

public class check {

    
    public static boolean isPositive(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

  
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

       
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

       
        for (int i = 0; i < arr.length; i++) {

            if (isPositive(arr[i])) {

                System.out.print(arr[i] + " is Positive and ");

                if (isEven(arr[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

       
        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } 
        else if (result == 0) {
            System.out.println("First and last elements are equal");
        } 
        else {
            System.out.println("First element is less than last element");
        }
    }
}