
interface Insurable {
    void calculateInsurance(double insurance);
    double getInsuranceDetails();
}


abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private int rate;

    
    Vehicle(int vehicleNumber, String type, int rate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rate = rate;
    }

    
    public int getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(int vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getRate() { return rate; }
    public void setRate(int rate) { this.rate = rate; }

   
    abstract double calculateRentalCost(int days);
}


class Car extends Vehicle implements Insurable {
    private double insurance;

    Car(int vehicleNumber, int rate) {
        super(vehicleNumber, "Car", rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return days * getRate();
    }

    @Override
    public void calculateInsurance(double insurance) {
        this.insurance = insurance;
    }

    @Override
    public double getInsuranceDetails() {
        return insurance;
    }
}


class Bike extends Vehicle implements Insurable {
    private double insurance;

    Bike(int vehicleNumber, int rate) {
        super(vehicleNumber, "Bike", rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return days * getRate() * 0.8; 
    }

    @Override
    public void calculateInsurance(double insurance) {
        this.insurance = insurance;
    }

    @Override
    public double getInsuranceDetails() {
        return insurance;
    }
}


class Truck extends Vehicle implements Insurable {
    private double insurance;

    Truck(int vehicleNumber, int rate) {
        super(vehicleNumber, "Truck", rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return days * getRate() * 1.5; 
    }

    @Override
    public void calculateInsurance(double insurance) {
        this.insurance = insurance;
    }

    @Override
    public double getInsuranceDetails() {
        return insurance;
    }
}


public class Third {
    public static void main(String[] args) {
        Car car = new Car(101, 2000);
        car.calculateInsurance(5000);
        System.out.println("Car Rental Cost for 3 days: " + car.calculateRentalCost(3));
        System.out.println("Car Insurance: " + car.getInsuranceDetails());

        Bike bike = new Bike(102, 500);
        bike.calculateInsurance(1000);
        System.out.println("Bike Rental Cost for 3 days: " + bike.calculateRentalCost(3));
        System.out.println("Bike Insurance: " + bike.getInsuranceDetails());

        Truck truck = new Truck(103, 4000);
        truck.calculateInsurance(10000);
        System.out.println("Truck Rental Cost for 3 days: " + truck.calculateRentalCost(3));
        System.out.println("Truck Insurance: " + truck.getInsuranceDetails());
    }
}