import java.util.Scanner;
public class Sam {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter The Marks Of PCM : ");
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int C = input.nextInt();
        int M = input.nextInt();
        int sum = P + C + M;
        int avg = sum / 3;
        input.close();
        System.out.println("Avg Of Marks : "+avg);
    }
}