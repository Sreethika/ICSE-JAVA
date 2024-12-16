import java.util.*;
public class twisted_prime
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display wheather it is a twisted prime number or not");
        int n=sc.nextInt();
        int n2=n;
        int d;
        int r=0;
        int s=0;
        while(n!=0)
        {
          d=n%10;
          r=(r*10)+d;
          n=n/10;
        }
        System.out.println("the reverse of the entered number is "+r);
        d=0;
        for(n=1;n<=n2;n++)
        {
           if(n2%n==0)
           d+=1;
        }
        for(n=1;n<=r;n++)
        {
           if(r%n==0)
           s+=1;
        }
        if((d==2)&&(s==2))
        System.out.println("the entered number is a twisted prime number");
        else
        System.out.println("the entered number is not a twisted prime number");
    }
}