import java.util.Scanner;
class spring {
    public static void main(String[] args) {
        System.out.println("Enter Day : ");
        Scanner input = new Scanner(System.in);
        int date = input.nextInt();
        System.out.println("Enter Month : ");
        int Month = input.nextInt();
        if (date == 20||Month==3 && date == 20 || Month == 6) {
            System.out.println("Spring Season");
        }
        else{
            System.out.println("Not Spring Season ");
        }
    }    
}