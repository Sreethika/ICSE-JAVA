import java.util.*;
public class sum1
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("series:a,a^2,a^3,......");
       System.out.println("enter the end number");
       int n=sc.nextInt();
       System.out.println("enter the value of a");
       int n2=sc.nextInt();
       double sum=0;
       double s=0;
        for(int x=1;x<=n;x++)
        {
         s=Math.pow(n2,x);
         sum=sum+s;
         s=0;
        }
         System.out.println("sum of the series "+sum);
    }
}