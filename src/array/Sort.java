package array;

import java.util.Arrays;

public class Sort {

     void swap(int []arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    void sort(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort s=new Sort();
        int []arr=new int[]{7,4,1,5,3,6,2};
        s.sort(arr);
        System.out.println(Arrays.toString(arr));


    }




}
