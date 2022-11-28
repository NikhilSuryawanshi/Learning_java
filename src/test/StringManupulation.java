package test;

import java.util.Locale;

public class StringManupulation {
    public String toUpperCase(String a)
    {
        String result="";
        for (int i = 0; i < a.length() ; i++) {
            int temp=(int)a.charAt(i);
            if (97<=temp&&temp<=122)
            {
                temp=temp-32;
                result=result+((char) temp);
            }else {
                result = result + ((char) temp);
            }
        }
        return result;
    }

    public String toLowerCase(String s)
    {
        String result="";
        for (int i = 0; i < s.length(); i++) {
            int temp=(int) s.charAt(i);
            if(65<=temp&&temp<=90)
            {
                temp+=32;
                result+=(char) temp;
            }
            else {
                result+=(char) temp;
            }
        }
        return result;
    }









    public static void main(String[] args) {

//        int a=10;
//        float b=20.1f;
//        char c='c';
//        boolean d=true;
//        String e="Elephant";
//        // escape sequence  new line =\n    tab=\t  backspace=\b
////        System.out.println("int="+a +"\nfloat=\'"+b+"\'");
//        String v = new String(e+" is a Big Animal.");
//
//        System.out.println( v.);


        StringManupulation s=new StringManupulation();
        System.out.println(s.toLowerCase("Nikhil Suryawanshi"));


    }
}
