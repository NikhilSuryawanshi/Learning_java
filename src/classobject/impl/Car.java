package classobject.impl;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public int getWheels() {
        return 4;
    }

    @Override
    public String getName() {
        return "Car";
    }
}
