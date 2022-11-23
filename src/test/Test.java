package test;

public class Test {

   public  int sum(int a,int b)
    {
        return a+b;
    }
    public char lastLetterOfString(String s){
       return s.charAt(0);
    }

    public static void main(String[] args) {
        Test a=new Test();
        System.out.println(a.sum(10,20));
        System.out.println(a.lastLetterOfString("Nikhil"));
    }

}
