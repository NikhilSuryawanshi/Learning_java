package day;

public class Bike extends Vehicle{

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + this.getName() + '\'' +
                ", engine='" + this.getEngine() + '\'' +
                ", colour='" + this.getColour() + '\'' +
                ", wheel=" + this.getWheel() +
                '}';
    }
}
