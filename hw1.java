import java.util.*;
public class hw1
{
    public double power(double a, int b, int c)
    {
        a=(1/(Math.pow(a,2)))+(2/(Math.pow(b,2)))+(3/(Math.pow(c,2)));
        return(a);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("1/a^2 + 2/b^2 + 3/c^2");
        System.out.println("enter values of a,b,c to print the sum");
        double a=sc.nextDouble();
        int b=sc.nextInt();
        int c=sc.nextInt();
        hw1 ob=new hw1(); 
        a=ob.power(a,b,c);
        System.out.println("sum="+a);
    }
}