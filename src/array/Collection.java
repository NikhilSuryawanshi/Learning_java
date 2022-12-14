package array;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<String> l=new ArrayList<String>();
        l.add("Yash");
        l.add("Vidhi");
        l.add("monika");
        l.add(0,"madhav");
        System.out.println(l);
        List <String>l1 =l;
        l1.add("Nikhil");
        l1.remove(2);
        l1.addAll(List.of("Aman", "Ashish", "Nilesh"));
        System.out.println(l1);






    }
}
