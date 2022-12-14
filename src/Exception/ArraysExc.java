package Exception;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysExc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        try {
            c=a/b;
        }
        catch (ArithmeticException e)
        {
            Throwable t;
            System.out.println("You can't divide any number by 0");
        }
        System.out.println("Ans is :"+c);




    }
}
