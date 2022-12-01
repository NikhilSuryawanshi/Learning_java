package classobject;

public class Polymorphism {

    int add(int a ,int b)
    {
        System.out.println("int");
        return a+b;
    }
    float add(float a,float b)
    {
        System.out.println("float");
        return a+b;
    }
    double add (double a,double b)
    {
        return a+b;
    }
    float add (int a,float b)
    {
        return a+b;
    }
    int add(int... a)
    {
        int res=0;
        for (int j : a) {
            res += j;
        }
        return res;
    }


    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        System.out.println(p.add( 10, 20,30,40,50,60,70,80,90,100));
    }

}
