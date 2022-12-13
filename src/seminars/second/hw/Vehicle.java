package seminars.second.hw;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private int speed;
    public abstract void drive();
    public abstract void park();
}
