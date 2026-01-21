import java.util.Scanner;
public class conversions {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Height In  CM : ");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        double f = h / 30.48;
        double i = f * 12;
        input.close();
        System.out.println("Height In Feet : "+f);
        System.out.println("Height In Inches : "+i);
    }
}