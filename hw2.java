import java.util.*;
public class hw2
{        
    public static void main (String args[])
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("for every number m, pythogoran triplet can be written as 2m, m^2-1, m^2+1");
       System.out.println("enter the number m to print its pythogoran triplet");
       int m=sc.nextInt();       
       System.out.println("pythogoran triplet "+(2*m)+","+(Math.pow(m,2)-1)+","+(Math.pow(m,2)+1));
    }
}