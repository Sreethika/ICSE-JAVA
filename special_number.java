import java.util.*;
public class special_number
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find if the entered number is a special number or not");
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n2=n;
        int d;
        int f=1,s=0;
        while(n!=0)
        {
           d=n%10;
           for(int x=1;x<=d;x++)
             f=f*x;
           s=s+f;
           n=n/10;
        }
        System.out.println("The sum of the factorial is "+s);
        if (n2==s)
            System.out.println("The entered number is a special number");
         else
            System.out.println("The entered number is not a special number");
    }
}
