import java.util.*;
public class method_3
{
    public int pronic(int n)
    {
        short x=0;
        for(int i=1; i<n; i++)
        {
            if((n%i==0)&&(n%(i+1)==0))
            x=1;
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number to check if the number is pronic number or not");
        int n=sc.nextInt();
        method_3 ob=new method_3();
        int x=ob.pronic(n);
        if(x==1)
        System.out.println("the entered number is a pronic number");
        else
        System.out.println("the entered number is not a pronic number");
    }
}