import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : - ");
        int n = sc.nextInt();
        Integer obj = n;
        System.out.println("Primitive Form : - "+n);
        System.out.println("Object Form : - "+obj);
    }
}