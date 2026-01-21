import java.util.Scanner;
public class harry {
@SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter DOBY : ");
        Scanner input = new Scanner(System.in);
        int birth_year = input.nextInt();
        int current_year = 2026;
        int age = current_year - birth_year;
        input.close();
        System.out.println("Age Of Harry Is : "+age);
    }
}