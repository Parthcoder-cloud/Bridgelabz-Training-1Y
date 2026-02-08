import java.util.Scanner;
public class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element " +i+ " :-");
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondlargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}