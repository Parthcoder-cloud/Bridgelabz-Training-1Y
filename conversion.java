import java.util.Scanner;
public class conversion {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args){
    System.out.println("Enter KiloMeter : ");
    Scanner input = new Scanner(System.in);
    int km = input.nextInt();
    int meter = km * 1000;
    System.out.println("Convert Meter To KiloMeter : "+meter);
    System.out.println("m");
    input.close();
}
}