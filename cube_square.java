import java.util.*;
public class cube_square
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display its square root and cube root in rounded off form");
        int n=sc.nextInt();
        System.out.println("The square root is "+(Math.round(Math.sqrt(n))));
        System.out.println("The cube root is "+(Math.round(Math.cbrt(n))));
    }
}