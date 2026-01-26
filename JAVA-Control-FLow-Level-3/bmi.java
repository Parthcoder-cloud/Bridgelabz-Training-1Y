import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        System.out.println("Enter Weight And Height : ");
        Scanner input = new Scanner(System.in);
        double w = input.nextDouble();
        double h = input.nextDouble();
        double bmi = w / (h * h);
        if (bmi <= 18.4) {
            System.out.println("UnderWeight.");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal.");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("OverWeight.");
        }
        else{
            System.out.println("Obese.");
        }
    }
}