import java.util.Scanner;
public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int [] arr1 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Salary Of " +i+ " :");
            arr[i] = sc.nextByte();
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.println("Enter Your Year Of Service " +i+ " :");
            arr[j] = sc.nextByte();
        }
    }
}