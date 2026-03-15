import java.util.Scanner;

public class vote {

    
    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false; // invalid age
        }

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        vote obj = new vote();

        for (int i = 0; i < age.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();

            boolean result = obj.canStudentVote(age[i]);

            if (result) {
                System.out.println("Student can vote");
            } else {
                System.out.println("Student cannot vote");
            }
        }
    }
}