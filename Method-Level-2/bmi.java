import java.util.Scanner;

public class bmi {

    
    public static void calculateBMI(double[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            double weight = arr[i][0];
            double heightCm = arr[i][1];

            double heightM = heightCm / 100; // convert cm to meter

            double bmi = weight / (heightM * heightM);

            arr[i][2] = bmi; 
        }
    }

 
    public static String getStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } 
        else if (bmi < 25) {
            return "Normal";
        } 
        else if (bmi < 30) {
            return "Overweight";
        } 
        else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

       
        for (int i = 0; i < data.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

       
        calculateBMI(data);

        
        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    data[i][0],
                    data[i][1],
                    bmi,
                    getStatus(bmi));
        }
    }
}