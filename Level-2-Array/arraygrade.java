import java.util.Scanner;
public class arraygrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Students :- ");
        int n = sc.nextByte();
        int [] physics = new int[n];
        int [] chemistry = new int[n];
        int [] maths = new int[n];
        double [] percentage = new double[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Marks Physics " +i+ " :-");
            physics[i] = sc.nextInt();
            System.out.println("Enter Marks Chemistry " +i+ " :-");
            chemistry[i] = sc.nextInt();
            System.out.println("Enter Marks Maths " +i+ " :-");
            maths[i] = sc.nextInt();
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Percentage Of Student " +i+ " :-"+percentage[i]);
        }
    }
}