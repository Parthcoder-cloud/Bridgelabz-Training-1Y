import java.util.Scanner;
public class check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element At Index " +i+ " :");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Number Is "+arr[i]+ " Negative");
            }
            else if (arr[i] > 0) {
                 System.out.println("Number Is "+arr[i]+ " Positive");
            }
            else{
                 System.out.println("Number Is "+arr[i]+ " Zero");
            }
        }
    }
}