import java.util.*;
public class co_prime
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("To check wheather the entered numbers are co primes or not");
       System.out.println("enter the first number");
       int n=sc.nextInt();
       System.out.println("enter the second number");
       int n2=sc.nextInt();
       int gcd=0;
        for(int x=1;x<n;x++)
        {
         if((n%x==0)&&(n2%x==0))
         gcd=x;
        }
       if (gcd==1) 
       System.out.println("They are co primes");
       else
       System.out.println("They are not co primes");
    }
}