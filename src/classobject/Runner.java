package classobject;

public class Runner {


    public static void main(String[] args) {

//        Student mayur=new Student(45,"Mayur","Barange",12,"mayurbarange@gmail.com","523524354325");
//        Student chandan=new Student(22,"Chandan","Barange",3,"chandanbarange@gmail.com","543254343");
//
//        Vehicle car=new Vehicle("car","suv",4,"bs4",200,"RED");
//        Vehicle bike=new Vehicle();
//        car.setName("Tarzan");
//        System.out.println(car);
//        System.out.println(bike);






        Rbi i=new ICICI(50000);
        Rbi h=new HDFC(40000);
        i.deposite(2000);
        i.withdrawl(10000);
        System.out.println(i);

        h.withdrawl(200);
        System.out.println(h);







    }
}
