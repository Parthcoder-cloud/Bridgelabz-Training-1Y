import java.util.Scanner;
public class reversearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :- ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number Of Digit :- "+count);
        temp = n;
        int c = 0;
        int [] arr = new int[count];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}