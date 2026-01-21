import java.util.Scanner;
public class Areaofcircle {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int a = input.nextInt();
         input.close();
        float pi = 3.14f;
        float area = pi * a * a;
        System.out.println("Area Of Circle : "+area);
    }
}