import java.util.*;
public class hw3
{
    public double sq(double num)
    {
      num=Math.round(Math.sqrt(num));
      return(num);
    }
    public double cb(double num)
    {
      num=Math.round(Math.cbrt(num));
      return(num);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number to find its rounded off square root and cube root");
        double num=sc.nextDouble();double num2=num;
        hw3 ob=new hw3();
        num=ob.sq(num);
        System.out.println("rounded off square root="+num);
        num2=ob.cb(num2);
        System.out.println("rounded off cube root="+num2);
    }
}