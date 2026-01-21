import java.util.Scanner;

public class volume {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius and Height:");
        int r = input.nextInt();
        int h = input.nextInt();

        float pi = 3.14f;
        float volume = pi * r * r * h;

        System.out.println("Volume Of Cylinder : " + volume);
        input.close();
    }
}
