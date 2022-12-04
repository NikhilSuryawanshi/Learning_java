package Day12;

public class Vehicle {
    private String name;
    private String model;
    private String engine;
    private int wheels;

    public Vehicle() {
    }

    public Vehicle(String name, String model, String engine, int wheels) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
