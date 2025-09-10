package Logical_Inheritance;

class Vehicle {
    String make, model, fuelType;
    int year;
    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make; this.model = model; this.year = year; this.fuelType = fuelType;
    }
    double getFuelEfficiency() { return 0; }
    double getMaxSpeed() { return 0; }
    double getDistanceTraveled(double fuel) { return fuel * getFuelEfficiency(); }
}
class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    double getFuelEfficiency() { return 3; }
    double getMaxSpeed() { return 113; }
}
class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    double getFuelEfficiency() { return 17.0; }
    double getMaxSpeed() { return 173; }
}
class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    double getFuelEfficiency() { return 37.0; }
    double getMaxSpeed() { return 197; }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Tata", "LPT 1613", 2020, "Diesel");
        Vehicle car = new Car("Toyota", "Corolla", 2022, "Petrol");
        Vehicle bike = new Motorcycle("Honda", "CBR 250R", 2021, "Petrol");
        System.out.println("Truck: Distance with 20L fuel = " + truck.getDistanceTraveled(20) + " km, Max Speed = " + truck.getMaxSpeed() + " km/h");
        System.out.println("Car: Distance with 20L fuel = " + car.getDistanceTraveled(20) + " km, Max Speed = " + car.getMaxSpeed() + " km/h");
        System.out.println("Motorcycle: Distance with 20L fuel = " + bike.getDistanceTraveled(20) + " km, Max Speed = " + bike.getMaxSpeed() + " km/h");
    }
}


