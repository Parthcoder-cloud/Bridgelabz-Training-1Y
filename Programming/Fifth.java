

interface GPS{
    void getCurrentLocation(String Location);
    void updateLocation(String newLocation);
}
abstract class Vehicle{
    int VehicleId;
    String DriverName;
    double rate;
    abstract double calculateFare(double distance);

     Vehicle(int VehicleId,String DriverName,double rate) {
        this.VehicleId = VehicleId;
        this.DriverName = DriverName;
        this.rate = rate;
    }
public void setVehicleId(int VehicleId){
    this.VehicleId = VehicleId;
}    
public void setDriverName(String DriverName){
    this.DriverName = DriverName;
}
public void setrate(double rate){
    this.rate = rate;
}
public int getVehicleId(){
    return VehicleId;
}
public String getDriverName(){
    return DriverName;
}
public double getrate(){
    return rate;
}
void display(double distance){
    System.out.println("Vehicle_Id : -- "+VehicleId);
    System.out.println("Driver_Name : -- "+DriverName);
  System.out.println("Total Cost for " + distance + " km: " + calculateFare(distance));
}
}
class Car extends Vehicle implements GPS{

    public Car(int VehicleId,String DriverName,double rate) {
        super(VehicleId, DriverName, rate);
    }
    double calculateFare(double distance){
        return rate * distance + 50;
    }
    public void getCurrentLocation(String location) {
        System.out.println("Car Current Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Car Location Updated To: " + newLocation);
    }
}
class Bike extends Vehicle implements GPS{

     Bike(int VehicleId,String DriverName,double rate) {
        super(VehicleId, DriverName, rate);
    }
    double calculateFare(double distance){
        return rate * distance + 20;
    }
    public void getCurrentLocation(String Location){
        System.out.println("Location : -- "+Location);
    }
    public void updateLocation(String newLocation){
        System.out.println("Update_Location : -- "+newLocation);
    }
}


public class Fifth {

    
    public static void main(String[] args) {
        Car c1 = new Car(345678, "Akash", 100);
        Bike b1 = new Bike(678910, "Gaurav", 60);
        c1.display(5);
        c1.getCurrentLocation("Nehru Nagar");
        c1.updateLocation("Laxmi Nagar");
        System.out.println();
        b1.display(6);
        b1.getCurrentLocation("CP");
        b1.updateLocation("Chor Bazar");
    }
}