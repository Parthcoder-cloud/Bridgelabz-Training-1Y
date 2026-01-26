import java.util.Scanner;
public class calendar {

    public static void main(String[] args) {
        System.out.println("Enter Month(1-12) : ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        System.out.println("Enter Day : ");
        int d = input.nextInt();
        System.out.println("Enter Year : ");
        int y = input.nextInt();
        int y1 = y - (14-m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m1 = m + 12 *((14-m)/12)-2;
        int d1 = (d + x + (31 * m1) / 12) % 7;
        System.out.println("Day Of Week : "+d1);
        if (d1 == 0) {
            System.out.println("Sunday.");
        }
        else if (d1 == 1) {
            System.out.println("Monday.");
        }
        else if (d1 == 2) {
            System.out.println("Tuesday.");
        }
        else if (d1 == 3) {
            System.out.println("Wednesday.");
        }
        else if (d1 == 4) {
            System.out.println("Thrusday");
        }
        else if (d1 == 5) {
            System.out.println("Friday");
        }
        else if (d1 == 6) {
            System.out.println("Saturday");
        }
    }
}