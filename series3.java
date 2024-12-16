import java.util.*;
public class series3
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("series:1,1+2,1+2+3,......");
       System.out.println("enter the end number");
       int n=sc.nextInt();
       int sum=0;
       int s=0;
        for(int x=1;x<=n;x++)
        {
          for(int y=1;y<=x;y++)
           {
             s=y+s;
           }
         sum=sum+s;
         s=0;
        }
         System.out.println("sum of the series "+sum);
    }
}