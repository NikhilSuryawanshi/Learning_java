package day;

public class Methods {
    static void faltu()
    {
        System.out.println("bjhcfadgfhedajfasdbkfasfsdka");
    }

static void print(String name){
    System.out.println(name);
}


static int sum(int a,int b)
{
   int c=a+b;
   return c;
}

int sum(int a,int b,int c)
    {

        return a+b+c;
    }

static boolean isOdd(int n)
{
    if (n%2==0)
    {
        return false;
    }
    else {
        return true;
    }

}
static char asciCode(byte n)
{
    return (char)n;
}




    public static void main(String[] a) {
        Methods obj=new Methods();

        int s1 = obj.sum(10,20);   // int s1=30;
        int s2 =sum (30,40);
        System.out.println(isOdd(22));
        System.out.println(asciCode((byte) 98));


        int res=     obj.sum (30,40,70);
        System.out.println(res);

    }


}
