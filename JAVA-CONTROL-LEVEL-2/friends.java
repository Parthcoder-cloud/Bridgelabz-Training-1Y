import java.util.Scanner;
class friends{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age of amar");
        int Age1=input.nextInt();
        System.out.println("enter the height of amar");
        float height1=input.nextFloat();
        System.out.println("enter the age of akhbar");
        int Age2=input.nextInt();
        System.out.println("enter the height of akhbar");
        float height2=input.nextFloat();
        System.out.println("enter the age of anthony");
        int Age3=input.nextInt();
        System.out.println("enter the height of akhbar");
        float height3=input.nextFloat();
        if (Age1<Age2 && Age1<Age3) {
            System.out.println("Amar is youngest");
        }
        else if (Age2<Age1 && Age2<Age3) {
            System.out.println("Akhbar is youngest");
        }
        else if (Age3<Age1 && Age3<Age1) {
            System.out.println("Anthony is youngest");  
        }
        if (height1>height2 && height1>height3) {
            System.out.println("Amar is tallest");
        }
        else if (height2>height1 && height2>height3) {
            System.out.println("Akhbar is tallest");
        }
        else if (height3>height1 && height3>height2) {
            System.out.println("Anthony is tallest");
            
        }
    }
}