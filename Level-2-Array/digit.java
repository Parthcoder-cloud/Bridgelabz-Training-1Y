import java.util.Scanner;
public class digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :- ");
        int n = sc.nextInt();
        int max_digit = 10;
        int [] arr = new int[max_digit];
        int i = 0; 
        while (n != 0) {
            int lastdigit = n % 10;
            arr[i] = lastdigit;
            i++;
            if(i == max_digit){
                break;
            }
             n /= 10;
        }
        int largest = 0;
        int secondlargest = 0;
        for(int j = 0;j<i;j++){
        if (arr[j] > largest) {
            secondlargest = largest;
            largest = arr[j];
        }
        else if (arr[j] > secondlargest && arr[j] != largest) {
            secondlargest = arr[j];
        }
    }
        System.out.println("Largest : "+largest);
        System.out.println("Second Largest : "+secondlargest);
    }
}