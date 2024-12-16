import java.util.*;
public class amstrong
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display wheather it is a amstrong number or not");
        int n=sc.nextInt();
        int n2=n;
        int d;
        int s=0;
        while(n!=0)
        {
          d=n%10;
          s+=(d*d*d);
          n=n/10;
        }
        if(n2==s)
        System.out.println("the entered number is an amstrong number");
        else
        System.out.println("the entered number is not an amstrong number");
    }
}