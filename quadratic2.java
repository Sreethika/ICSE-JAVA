import java.util.*;
public class quadratic2
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the nature of a quadratic equation");
        System.out.println("Enter the values of a, b, c in a quadratic equation");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double d=(Math.round((b*b)-(4*a*c)));
        double r1=1,r2=1;
        System.out.println("The discriminant of the quadratic equation is "+d);
       if (d>=0)
        {
         System.out.println("roots are real ");
         r1=(-b+(Math.sqrt(d)))/(2*a);
         r2=(-b-(Math.sqrt(d)))/(2*a);
        }
        else if(d<0)
        {
         System.out.println("roots are imaginary ");
         r1=(-b+(Math.sqrt(d)))/(2*a);
         r2=(-b-(Math.sqrt(d)))/(2*a);
        }
        System.out.println("root 1 is "+r1+"root 2 is "+r2);
    }
}