import java.util.Scanner;
public class bmiarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Person :- ");
        int n = sc.nextInt();
        double [] Weight = new double[n];
        double [] Height = new double[n];
        double [] bmi =new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Weight Of " +i+ " :-");
            Weight[i] = sc.nextDouble();
            System.out.println("Enter Height :- ");
            Height[i] = sc.nextDouble();
            bmi[i] = Weight[i] / Height[i] * Height[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println("BMI Of Person " +i+ " :-"+bmi[i]);
        }
    }
}