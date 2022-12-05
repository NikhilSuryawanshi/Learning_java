package classobject.impl;

public class BIke implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running");
    }

    @Override
    public int getWheels() {
        return 2;
    }

    @Override
    public String getName() {
        return "bike";
    }
}
