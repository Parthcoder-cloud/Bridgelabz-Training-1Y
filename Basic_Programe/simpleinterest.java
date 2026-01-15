import java.util.Scanner;
public class simpleinterest {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Principle,Rate And Time : ");
    int rupees = input.nextInt();
    float rate = input.nextFloat();
    float t = input.nextFloat();
    input.close();
    float S = (rupees * rate * t)/100;
    System.out.println("Simple Interest : "+S);
}    
}