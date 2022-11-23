package array;

import java.util.Scanner;

public class Day1 {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Eneter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of index "+i+" :");
            arr[i]=s.nextInt();
        }

        for (int i = 0; i <size ; i++) {
            System.out.println("Value of arr["+i+"]="+arr[i]);
        }


    }

}
