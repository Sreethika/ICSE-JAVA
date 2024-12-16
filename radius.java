import java.util.*;
public class radius
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find radius of a sphere by taking volume as input");
        System.out.println("Enter the volume of a sphere");
        int v=sc.nextInt();
        System.out.println("The radius is "+(Math.cbrt(v*3/4*7/22)));
    }
}