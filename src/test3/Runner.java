package test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String path="C:\\Users\\Venjix\\Downloads\\employees.csv";
        List <Employee> e=new LinkedList<>();

        try {
            File f = new File(path);
            Scanner file = new Scanner(f);
            file.nextLine();
            while (file.hasNext()) {
                String arr[]=file.nextLine().split(",");

                int employeeId=Integer.parseInt(arr[0].trim());
                String firstName=arr[1].trim();
                String lastName=arr[2].trim();
                String email=arr[3].trim();
                String phone=arr[4].trim();
                String hireDate=arr[5].trim();
                String jobId=arr[6].trim();
                int salary=Integer.parseInt(arr[7].trim());
                String commision=arr[8].trim();;
                int managerId=Integer.parseInt(arr[9].trim());
                int departmentId=Integer.parseInt(arr[10].trim());
                Employee tmp=new Employee(employeeId,firstName,lastName,email,phone,hireDate,jobId,salary,commision,managerId,departmentId);
                e.add(tmp);
            }

        }
        catch (FileNotFoundException exc)
        {
            System.out.println("File not found at given path");
        }

        System.out.println(e);

    }
}
