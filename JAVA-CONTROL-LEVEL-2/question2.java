import java.util.Scanner;
class question2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary:");
        Float salary=input.nextFloat();
        System.out.println("Enter year of service:");
        Float year=input.nextFloat();
        float Bonus;
        Bonus=(salary/100)*5;
        if (year>5) {
            System.out.println("your bonus amount is: "+Bonus);
        }
        else{
            System.out.println("you are not eligible for bonus");
        }
    }
}