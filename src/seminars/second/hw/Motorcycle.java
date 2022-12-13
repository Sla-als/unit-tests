package seminars.second.hw;

public class Motorcycle extends Vehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private int speed;

    public Motorcycle (String make, String model, int year) {
        if (make == null || model == null) {
            throw new IllegalArgumentException("A make and model are required to construct a motorcycle.");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        this.numWheels = 2;
        this.speed = 0;
    }
    public void drive() { this.speed = 75; }
    public void park() { this.speed = 0; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "This motorcycle is a “ + year + “ “ + make + “ “ + model + “;"; }
}