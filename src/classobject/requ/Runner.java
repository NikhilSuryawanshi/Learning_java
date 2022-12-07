package classobject.requ;

public class Runner {
    public static void main(String[] args) {
        Student s1=new SchlStudent("Madhav","madhav@gmail.com",12);
        Student c1=new ClgStudent("Yash","yash@gmail.com","CSE",8);
        Student s2=new SchlStudent("Chandan","chandan@gmail.com",10);
        Student c2=new ClgStudent("Ashish","ashish@gmail.com","ME",6);
        Student s3=new SchlStudent("Aman","aman@gmail.com",11);
        Student c3=new ClgStudent("Anuj","anuj@gmail.com","CSE",4);

        System.out.println(s1);
        System.out.println(c1);
        System.out.println(s2);
        System.out.println(c2);
        System.out.println(s3);
        System.out.println(c3);
    }
}
