import java.util.*;
public class lcm
{
    public void GLCM(int z,int y)
    {
        int gcd=1;
        for(int x=1;x<=z;x++)
        {
            if((z%x==0)&&(y%x==0))
            gcd=x;
        }
        int lcm=(z*y)/gcd;
        System.out.println("gcd="+gcd);
        System.out.println("lcm="+lcm);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers to find their lcm");
        int a=sc.nextInt();
        int b=sc.nextInt();
        lcm ob=new lcm();
        ob.GLCM(a,b);
    }
}    