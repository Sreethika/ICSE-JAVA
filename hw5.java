import java.util.*;
public class hw5
{
    public double dis(double a, int b, int c)
    {
        a=Math.round(Math.pow(b,2)-(4*a*c));
        return(a);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("quadratic equation= ax^2+bx+c=0");
        System.out.println("enter values of a,b,c to print the discriminant of the equation(rounded off)");
        double x=sc.nextDouble();
        int y=sc.nextInt();
        int z=sc.nextInt();
        hw5 ob=new hw5(); 
        x=ob.dis(x,y,z);
        System.out.println("discriminant="+x);
    }
}