import java.util.Scanner;
public class hand {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter Number Of Students : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int no_of_handshakes = num * ( num - 1)/2;
        System.out.println("Possible Hands : "+no_of_handshakes);
    }
}
