import java.util.Scanner;

class Employee {

    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Employee Name: ");
        e.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        e.id = sc.nextInt();

        System.out.print("Enter Salary: ");
        e.salary = sc.nextDouble();

        e.display();
    }
}