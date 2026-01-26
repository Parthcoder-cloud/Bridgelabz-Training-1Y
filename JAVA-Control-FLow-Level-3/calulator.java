import java.util.Scanner;
public class calulator {

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter Your Choice : ");
        char op = input.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
                case '*':
                    System.out.println(a * b);
                    break;
                    case '/':
                        System.out.println(a / b);
                        break;
                        case '%':
                            System.out.println(a % b);
                            break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }
    }
}