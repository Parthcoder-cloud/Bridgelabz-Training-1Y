import java.util.Scanner;
public class question1 {

    public static void main(String[] args) {
        double [] arr = new double[10];
        double [] arr1 = new double[10];
        double [] amount = new double[10];
        double [] total = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Salary Of Employee " +i+ " :-");
            arr[i] = sc.nextDouble();
            System.out.println("Enter Year Of Service " +i+ " :-");
            arr1[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            if (arr1[i] > 5) {
                amount[i] = arr[i] * 5/100.0;
                total[i] = arr[i] + amount[i];
            }
            else {
                amount[i] = arr[i] * 2/100.0;
                total[i] = arr[i] + amount[i];
            }
        }
        System.out.println("Bonus :- ");
        for (int i = 0; i < 10; i++) {
            System.out.println(+i+ " Employee Bonus :- " +amount[i]);
        }
        System.out.println("New Salary :");
        for (int i = 0; i < 10; i++) {
            System.out.println(+i+ " New Salary :- " +total[i]);
        }
        }
    }
