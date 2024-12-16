import java.util.*;
public class hw6
{        
    public static void main (String args[])
    {
       Scanner in=new Scanner (System.in);
       System.out.println("enter angle a and b to find the solution to trignometrical expression");
       System.out.println("tanA-tanB/1+tanA*tanB");
       double a=in.nextDouble(); 
       double b=in.nextDouble();     
       a*=22/(7*180);
       b*=22/(7*180);
       System.out.println("value of expression= "+(a-b)/(1+a*b));
    }
}