import java.util.Scanner;

public class kilometermiles {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Kilometer: ");
        Scanner input = new Scanner(System.in);

        float km = input.nextFloat();
        float miles = km / 1.6f;

        System.out.println("Km To Miles: " + miles);
        input.close();
    }
}
