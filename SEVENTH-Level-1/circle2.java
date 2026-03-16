import java.util.Scanner;

class circle2 {

    double radius;

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void circumference() {
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        circle2 c = new circle2();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();

        c.area();
        c.circumference();
    }
}