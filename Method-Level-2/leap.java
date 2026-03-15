import java.util.*;

public class leap {

    public int leap(int year) {

        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {

        System.out.println("Year :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        leap obj = new leap();
        int result = obj.leap(n);

        if (result == 1) {
            System.out.println("Leap Year");
        } 
        else if (result == 0) {
            System.out.println("Not a Leap Year");
        } 
        else {
            System.out.println("Year must be >= 1582");
        }
    }
}