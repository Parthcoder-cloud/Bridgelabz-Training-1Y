import java.util.Scanner;
class multiplication{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=input.nextInt();
         for (int i=6;i<=9;i++) {
                int a=n*i;
                System.out.println(+n +"*"+i+"="+a);
         }  
    }
}