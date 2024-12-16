import java.util.*;
public class twin_prime
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to chech wheather the entered numers are twin primes or not");
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int c=0,c2=0;
        for(int x=1;x<=n;x++)
        {
        if(n%x==0)
         c=c+1;
        }
        for(int x=1;x<=n2;x++)
        {
        if(n2%x==0)
         c2=c2+1;
        }
        if((c2==2)&&(c==2)&&((Math.abs(n2-n))==2))
        System.out.println("the entered numbers are twin primes");
        else
        System.out.println("the entered numbers are not twin primes");
    }
}