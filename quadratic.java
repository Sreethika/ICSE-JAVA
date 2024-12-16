import java.util.*;
public class quadratic
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the discriminant of a quadratic equation");
        System.out.println("Enter the values of a, b, c in a quadratic equation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The discriminant of the quadratic equation is "+(Math.round((b*b)-(4*a*c))));
    }
}