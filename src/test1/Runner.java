package test1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Student s1=new Student(1,"Gippy","Gerewal","pandhurna","gippy@gmail.com");
        Student s2=new Student(2,"Madhav","Sahu","Multai","madhav@gmail.com");
        Student s3= new Student(3,"Divyani","Makode","Betul","divyani@gmail.com");
        Student s4=new Student(4,"yash","Barange","multai","yash@gmail.com");
        Student s5=new Student(5,"Monika","Patel","Bhopal","monika@gmail.com");


        List <Student> l=new ArrayList<Student>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);

        System.out.println(l);


    }
}
