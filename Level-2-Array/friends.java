
import java.util.Scanner;


public class friends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] friends = new double[4];
        double [] Height = new double[4];
        for (int i = 0; i < friends.length; i++) {
            System.out.println("AGE " +i+ ":-");
            friends[i] = sc.nextDouble();
            System.out.println("Height " +i+ " :-");
            Height[i] = sc.nextDouble();
        }
        double min = friends[0];
        double tall = friends[0];
        for (int i = 1; i < friends.length; i++) {
            if (friends[i] < min) {
                min = friends[i];
            }
            if (Height[i] > tall) {
                tall = Height[i];
            }
        }
        System.out.println("Youngest :- "+min);
        System.out.println("Tallest : "+tall);
    }
}