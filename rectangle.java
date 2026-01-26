import java.util.Scanner;
public class rectangle {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lenght And Breadth");
        int l = input.nextInt();
        int b = input.nextInt();
        input.close();
        int rectangle = 2 *(l+b);
        System.out.println("Area Of Rectangle : "+rectangle);
    }
}