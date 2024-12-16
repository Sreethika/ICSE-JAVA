import java.util.*;
public class gcd
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to display their gcd");
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=1;
        for(int x=1;x<=n;x++)
        {
        if((n%x==0)&&(n2%x==0))
        gcd=x;
        }
        System.out.println("their gcd "+gcd);
    }
}