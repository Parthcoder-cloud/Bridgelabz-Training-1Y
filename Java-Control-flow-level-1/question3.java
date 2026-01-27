import java.util.Scanner;
class question3 {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        if (n > 0) {
            sum = n * (n+1) / 2;
            System.out.println("The Sum Of "+n+ " Number Is : "+sum);
        }
        else{
            System.out.println("The Number " +n+ " Is Not Natural Number.");
        }
    }    
}