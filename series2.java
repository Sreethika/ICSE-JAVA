import java.util.*;
public class series2
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in); 
       System.out.println("series:2,-4,6,-8,......");
       System.out.println("enter the end number");
       int n=sc.nextInt();
       int a=0; 
       int sum=0;
        for(int x=1;x<=10;x++)
        {
            a-=2;
            if(x%2!=0)
            {
             System.out.print(Math.abs(a)+" ");
             sum=(Math.abs(a))+sum;
            }
            else
            {
             System.out.print(a+" ");
             sum=sum+a;
            }
        }
       System.out.println();
       System.out.println("sum of the series "+sum);
    }
}