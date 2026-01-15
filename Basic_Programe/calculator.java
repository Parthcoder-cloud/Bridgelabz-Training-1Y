import java.util.Scanner;
public class calculator {
    @SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args){
    System.out.println("Enter Numbers : ");
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int sum = num1 + num2;
    int sub = num1 - num2;
    double Division = num1 / num2;
    int multi = num1 * num2;
    input.close();
    System.out.println("Addition : "+sum);
     System.out.println("Subtraction : "+sub);
      System.out.println("Division : "+Division);
       System.out.println("Multiplication : "+multi);
}
}