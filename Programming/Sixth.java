

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    int patientId;
    String name;
    int age;

    abstract double calculateBill(); 

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    void getPatientDetails() {
        System.out.println("Patient_Id : -- " + patientId);
        System.out.println("Patient_Name : -- " + name);
        System.out.println("Patient_Age : -- " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    int daysAdmitted;
    int roomchargeperday;
    int othercharge = 200;

    InPatient(int daysAdmitted, int roomchargeperday, int patientId, String name, int age) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomchargeperday = roomchargeperday;
    }

    double calculateBill() {
        return daysAdmitted * roomchargeperday + othercharge;
    }

    public void addRecord(String record) {
        System.out.println("Patient_Record : -- " + record);
    }

    public void viewRecords() {
        System.out.println("Viewing patient records...");
    }
}

class OutPatient extends Patient implements MedicalRecord {
    int consultationFee;
    int testfees = 500;

    OutPatient(int consultationFee, int patientId, String name, int age) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    double calculateBill() {
        return consultationFee + testfees;
    }

    public void addRecord(String record) {
        System.out.println("Patient_Record : -- " + record);
    }

    public void viewRecords() {
        System.out.println("Viewing patient records...");
    }
}

public class Sixth {
    public static void main(String[] args) {
        InPatient p1 = new InPatient(21, 300, 23452, "Raj", 28);
        OutPatient p2 = new OutPatient(600, 567, "Ravi", 21);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());
        p1.addRecord("Good");

        System.out.println();

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
        p2.addRecord("Checkup");
    }
}