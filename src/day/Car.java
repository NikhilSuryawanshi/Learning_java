package day;

public class Car extends Vehicle{

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.getName() + '\'' +
                ", engine='" + this.getEngine() + '\'' +
                ", colour='" + this.getColour() + '\'' +
                ", wheel=" + this.getWheel() +
                '}';
    }
}
