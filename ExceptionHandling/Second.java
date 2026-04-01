import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        System.out.println("Enter Size Of Array : - ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            System.out.println("Enter Index : - ");
            int index = sc.nextInt();
            System.out.println("Element : - - - " + arr[index]);
        } 
        catch (NullPointerException e) {
            System.out.println("Array is null!");
        } 
        catch (Exception e) {
            System.out.println("Not Possible, Result : - ");
            System.out.println(e);
        }
    }
}