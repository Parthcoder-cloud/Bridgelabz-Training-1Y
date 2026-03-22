interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
    abstract double calculateSalary();

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
public class First {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Ram", 50000);
        PartTimeEmployee e2 = new PartTimeEmployee(102, "Shyam", 200, 20);

        e1.assignDepartment("IT");
        e2.assignDepartment("Support");

        e1.displayDetails();
        System.out.println(e1.getDepartmentDetails());
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println();

        e2.displayDetails();
        System.out.println(e2.getDepartmentDetails());
        System.out.println("Salary: " + e2.calculateSalary());
    }
}