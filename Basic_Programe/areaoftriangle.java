import java.util.Scanner;
public class areaoftriangle {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Height And Base : ");
        Scanner input = new Scanner(System.in);
        int Height = input.nextInt();
        int Base = input.nextInt();
        input.close();
        int areaoftriangle = (Height * Base)/2;
        System.out.println("Area Of Triangle : "+areaoftriangle);
    }
}