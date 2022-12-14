package array;

public class GenericArray<T> {

   void  print(T data)
   {
       System.out.println(data);
       System.out.println(data.getClass());
   }




    public static void main(String[] args) {
        GenericArray <Integer> obj=new <Integer>GenericArray();
        float arr[]=new float[]{1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f};
        int arr1[]=new int[]{1,3,4,6,7,8,8};
        String s=new String("Nikhil");
        boolean b=true;
        int i=20;
        float f=30.5f;
        obj.print(i);


    }
}
