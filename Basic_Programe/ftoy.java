import java.util.Scanner;
public class ftoy {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Distance In Feet : ");
        Scanner input = new Scanner(System.in);
        int dist = input.nextInt();
        input.close();
        float yards = dist / 3f;
        float miles = dist / 5280f;
        System.out.println("Distance In Yards : "+yards);
        System.out.println("Distance In Miles : "+miles);
    }
}