import java.util.Scanner;
public class question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Person : -");
        int n = sc.nextInt();
        double[][] status = new double[n][2];
        for (int i = 0; i < status.length; i++) {
            System.out.println("Enter Weight for Person " +i+ " :-");
            status[i][0] = sc.nextDouble();
            System.out.println("Enter Height for Person " + i + ":");
            status[i][1] = sc.nextDouble();
        }
       double[] bmi = new double[n];
        for (int i = 0; i < status.length; i++) {
            double Weight = status[i][0];
            double Height = status[i][1];
            bmi[i] = Weight / Height * Height;
        }
        for (int i = 0; i < n; i++) {
           System.out.printf("Person %d -> BMI: %.2f\n", i, bmi[i]);
        }
    }
}