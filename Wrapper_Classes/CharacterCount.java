import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        System.out.println("Total Letters : " + letters);
        System.out.println("Total Digits : " + digits);
        System.out.println("Total Special Characters : " + special);
    }
}