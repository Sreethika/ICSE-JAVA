import java.util.*;
public class special
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find if the entered number is a special two digit number or not");
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=a;
        int s=0;
        int p=1;
        int d;
        for(short x=1;x<=2;x++)
        {
           d=b%10; 
           s=s+d;
           p=p*d;
           b=b/10;
        }
        s=s+p;
        if (s==a)
            System.out.println("The entered number is a special 2 digit number");
         else
            System.out.println("The entered number is not a special 2 digit number");
    }
}
