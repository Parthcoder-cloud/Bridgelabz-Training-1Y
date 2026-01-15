import java.util.Scanner;
public class perimeter {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Side :");
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        input.close();
        int perimeter = 4 * side;
        System.out.println("Perimeter of Square:"+perimeter);
    }
}