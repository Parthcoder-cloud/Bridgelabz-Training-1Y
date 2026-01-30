import java.util.Scanner;
public class natural {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = input.nextInt();

        int size = n / 2 + 1;        
        int odd[] = new int[size];
        int even[] = new int[size];

        int oddIndex = 0, evenIndex = 0;

       
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

       
        for (int j = 0; j < oddIndex; j++) {
            System.out.println("Odd : " + odd[j]);
        }

    
        for (int j = 0; j < evenIndex; j++) {
            System.out.println("Even : " + even[j]);
        }

        input.close();
    }
}
