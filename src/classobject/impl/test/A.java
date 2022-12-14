package classobject.impl.test;

import java.io.IOError;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A {

    int divide(int a ,int b) throws ArithmeticException
    {
      return a/b;
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int arrr[]=new int[5];
//        try {
//            for (int i = 0; i < 6; i++) {
//
//                    arrr[i]=s.nextInt();
//
//
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("size exceed. Error="+e.getClass());
//        }
        try {
            A obj = new A();
            int a = s.nextInt();
            int b = s.nextInt();

            int c = obj.divide(a, b);
            System.out.println(c);
            throw new IOException();
        }
        catch (InputMismatchException e)
        {
            System.out.println("text not allowed give numbers");
        }
        catch (ArithmeticException e)
        {
            System.out.println("can't divide by zero");
        }

        catch (Exception e)
        {
            System.out.println(e);
        }







    }
}


