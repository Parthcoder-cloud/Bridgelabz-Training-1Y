import java.util.Scanner;
public class vote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
       for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter Element At Index "+i+ " : ");
        arr[i] = input.nextInt();
       }
       for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            System.out.println("Student with age " + arr[i] + " → Invalid age");
        } 
        else if (arr[i] >= 18) {
            System.out.println("Student With Age "+ arr[i]+" Can Vote");
        }
        else{
            System.out.println("Cannot Vote.");
        }   
       }
    }
}