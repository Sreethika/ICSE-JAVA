import java.util.*;
public class number
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int i,j,c1=0,c2=0,c3=0;
       int a[]=new int[20];
       System.out.println("enter 20 numbers");
       for(i=0;i<20;i++)
       a[i]=sc.nextInt();
       for(i=0;i<20;i++)
       {
       if(a[i]%2==0)
       c1++;
       if(a[i]%2!=0)
       c2++;
       if(a[i]%4==0)
       c3++;
       }
       System.out.println("even numbers:"+c1);
       System.out.println("odd numbers:"+c2);
       System.out.println("multiples of 4:"+c3);
    }
}
