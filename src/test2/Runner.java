package test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        String path="C:\\Users\\Venjix\\Downloads\\student.csv";
        List <Student> l=new ArrayList<Student>();

        try{
            Scanner f=new Scanner(new File(path));
            f.nextLine();

            while (f.hasNext())
            {
                String[] arr=f.nextLine().split(",");
                System.out.println(Arrays.toString(arr));
                if (arr.length!=0) {
                    int id = Integer.parseInt(arr[0].trim());
                    String first_name = arr[1].trim();
                    String last_name = arr[2].trim();
                    char gender = arr[3].trim().charAt(0);
                    String hs_city = arr[4].trim();
                    String hs_state = arr[5].trim();
                    int hs_zip = Integer.parseInt(arr[6].trim());
                    String email = arr[7].trim();
                    float entry_age = Float.parseFloat(arr[8].trim());
                    Student tmp = new Student(id, first_name, last_name, gender, hs_city, hs_state, hs_zip, email, entry_age);
                    l.add(tmp);
                }

            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("CSV file not found");
        }


        System.out.println(l);

    }
}
