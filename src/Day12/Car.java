package Day12;

public class Car extends Vehicle{

    public Car(String name,String model,String engine,int wheels)
    {
        super(name,model,engine,wheels);
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.getName() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", engine='" + this.getEngine() + '\'' +
                ", wheels=" + this.getWheels() +
                '}';
    }
}
