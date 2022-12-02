package day;

public class Runner {
    public static void main(String[] args) {

        Vehicle c=new Car();
        c.setName("Verna");
        c.setColour("red");
        c.setEngine("desile");
        c.setWheel(4);
        System.out.println(c);

        Vehicle b=new Bike();
        b.setName("ktm");
        b.setColour("orange");
        b.setEngine("petrol");
        b.setWheel(2);
        System.out.println(b);




    }
}
