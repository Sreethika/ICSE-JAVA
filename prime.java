import java.util.*;
public class prime
{
    public int check(int a)
    {
        int i;short c=0;
        for(i=1;i<=a;i++)
        {
           if(a%i==0)
           c++;
        }
        if (c==2)
        return --c;
        else
        return c-c;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("to check if the entered number is prime");
        System.out.println("enter a number");
        int a=sc.nextInt();
        prime ob=new prime();
        int sol;
        sol=ob.check(a);
        if (a==1)
        System.out.println(a);
        else
        System.out.println("0");
    }
}