package seminars.second.hw;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private int speed;
    public Car(String make, String model, int year) {
        if (make == null || model == null) {
            throw new IllegalArgumentException("A make and model are    required to construct a car.");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        this.numWheels = 4;
        this.speed = 0;
    }
    public void drive() { this.speed = 60; }
    public void park() { this.speed = 0; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "This car is a “ + year + “ “ + make + “ “ + model + ";}
}