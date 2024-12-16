import java.util.*;
public class sum3
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("series:a/2,a/5,a/8,......");
       System.out.println("enter the value of a");
       int n2=sc.nextInt();
       int sum=0;
       int s=2;
        for(int x=1;x<=6;x++)
        {
         sum=sum+(1/s);
         s=s+3;;
        }
         System.out.println("sum of the series "+sum);
    }
}