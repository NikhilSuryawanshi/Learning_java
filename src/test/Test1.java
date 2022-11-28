package test;

public class Test1 {
    public String toUpperCase(String a)
    {
        String result="";

        for (int i = 0; i < a.length() ; i++) {

           int temp= (int)a.charAt(i);
           if (97<=temp && temp <=122)
           {
               temp=temp-32;
               result=result+(char)temp;
           }
           else {
               result=result+(char)temp;
           }
        }
        return result;
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        String res=t.toUpperCase("Nikhil");
        System.out.println( res  );
    }
}
