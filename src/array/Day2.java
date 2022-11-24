package array;
import java.util.Scanner;
import java.util.Arrays;
public class Day2 {
        int sumArray(int arr[]) {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result = result + arr[i];
            }
            return result;
        }

        int biggestElementArray(int arr[])
        {
            int max=arr[0];
            for (int i = 1; i < arr.length; i++) {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter the value of index "+i+": ");
            arr[i]=s.nextInt();
        }
        Day2 d=new Day2();
        int result = d.sumArray(arr);
        System.out.println("Sum of array is :" +result);
        int big=d.biggestElementArray(arr);
        System.out.println("Biggest element of array is :" +big);
        System.out.println(Arrays.toString(arr));
    }
}
