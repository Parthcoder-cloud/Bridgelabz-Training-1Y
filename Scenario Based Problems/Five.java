class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int rollNo, String name, int marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Branch : " + branch);
    }
}

public class Five {
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent(101, "Parth", 85, "CSE");
        s1.display();
        System.out.println("Grade : " + s1.calculateGrade());
    }
}