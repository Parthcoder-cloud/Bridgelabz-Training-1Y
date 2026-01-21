import java.util.Scanner;
public class fahrenheit {

    @SuppressWarnings("ConvertToTryWithResources")    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperatue In Celsius : ");
        float c = input.nextFloat();
        input.close();
        float  temp = (c * 9/5) + 32;
        System.out.println("Temperature In Fahrenheit:"+temp); 
    }
}