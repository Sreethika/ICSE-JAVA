import java.util.*;
public class series1
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("series:1,1,2,3,5......");
       System.out.println("enter the number of terms");
       int n=sc.nextInt();
       int a=1; 
       int b=1;
       int s;
       int sum=2;
       n-=2;
       System.out.print(a+" "+b+" ");
        for(int x=1;x<=n;x++)
        {
            s=a+b;
            System.out.print(" "+s);
            a=b;
            b=s;
            sum=s+sum;
        }
       System.out.println("");
       System.out.println("sum of the series "+sum);
    }
}