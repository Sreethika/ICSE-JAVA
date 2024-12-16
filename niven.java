import java.util.*;
public class niven
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display wheather it is a niven number or not");
        int n=sc.nextInt();
        int n2=n;
        int d;
        int s=0;
        while(n!=0)
        {
          d=n%10;
          s+=d;
          n=n/10;
        }
        if(n2%s==0)
        System.out.println("the entered number is a niven number");
        else
        System.out.println("the entered number is not a niven number");
    }
}