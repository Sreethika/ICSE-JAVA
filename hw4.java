import java.util.*;
public class hw4
{        
    public static void main (String args[])
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("volume of a sphere= 4*22*r*r*r/7*3");
       System.out.println("enter the volume of a sphere to find its radius");
       int v=sc.nextInt();       
       System.out.println("radius= "+Math.cbrt((v*3*7)/(4*22)));
    }
}