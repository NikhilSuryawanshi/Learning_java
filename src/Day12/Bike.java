package Day12;

public class Bike extends Vehicle{
    public Bike(String name, String model, String engine, int wheels) {
        super(name, model, engine, wheels);
    }

    public Bike() {
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + this.getName() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", engine='" + this.getEngine() + '\'' +
                ", wheels=" + this.getWheels() +
                '}';
    }

}
