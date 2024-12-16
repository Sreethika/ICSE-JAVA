import java.util.*;
public class method_16
{
    public int perimeter(int a)
    {
        a=a*4;
        return a;
    }
    public int perimeter(int a, int b)
    {
        a=2*(a+b);
        return a;
    }
    public double perimeter(double a)
    {
        a=(2*22*a)/7;
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        method_16 ob=new method_16();
        System.out.println("perimeter calculator:");
        System.out.println("enter the side of the square");
        int a=sc.nextInt();
        a=ob.perimeter(a);
        System.out.println(a);
        System.out.println("enter the length and breadth of rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        a=ob.perimeter(l,b);
        System.out.println(a);
        System.out.println("enter the radius of a circle");
        double r=sc.nextDouble();
        double x=ob.perimeter(r);
        System.out.println(x);    
    }
}