package classobject.impl;


public class Runner {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.run();
        System.out.println(v.getWheels());
        System.out.println(v.getName());
        Vehicle v1=new BIke();
        v1.run();
        System.out.println(v1.getName());
        System.out.println(v1.getWheels());
    }
}
