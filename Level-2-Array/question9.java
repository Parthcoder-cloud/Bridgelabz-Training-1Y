import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int m = 3; 
        int[][] marks = new int[n][m];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < m; j++) {
                total += marks[i][j];
            }
            double percentage = (total * 100.0) / (m * 100); 

            char grade;
            if (percentage >= 90)
                grade = 'A';
            else if (percentage >= 75)
                grade = 'B';
            else if (percentage >= 60)
                grade = 'C';
            else if (percentage >= 50)
                grade = 'D';
            else
                grade = 'F';

            System.out.printf("\nStudent %d -> Percentage: %.2f%%, Grade: %c\n", i + 1, percentage, grade);
        }

        sc.close();
    }
}
