package classobject;

public class Vehicle {

private  String name;
private  String  model;
private int wheel;
private String engine;
private int top_speed;
private String colour;

    public  Vehicle() {}
    public  Vehicle(String name,String model,int wheel,String engine,int top_speed,String colour)
    {
        this.name=name;
        this.model=model;
        this.wheel=wheel;
        this.engine=engine;
        this.top_speed=top_speed;
        this.colour=colour;
    }
    public String getName(){
        return this.name;
    }
    public  void setName(String name)
    {
        this.name=name;
    }
    public String getModel()
    {
        return this.model;
    }
    public void setModel(String model)
    {
        this.model=model;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", wheel=" + wheel +
                ", engine='" + engine + '\'' +
                ", top_speed=" + top_speed +
                ", colour='" + colour + '\'' +
                '}';
    }
}
