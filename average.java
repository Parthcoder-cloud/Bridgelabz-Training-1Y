import java.util.Scanner;
public class average {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Three Numbers : ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    input.close();
    int sum = a + b + c;
    float avg = sum / 3.0f;
    System.out.println("Avg Of Three Numbers Is : "+avg);
}
}