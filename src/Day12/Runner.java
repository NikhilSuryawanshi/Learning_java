package Day12;

public class Runner extends Vehicle{


    static {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        Bike b=new Bike("KTM","290","petrol",2);
        System.out.println(b);
        Car c=new Car("Swift","desire","diesel",4);
        System.out.println(c);
    }



}
