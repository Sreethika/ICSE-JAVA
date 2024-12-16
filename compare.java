import java.util.*;
public class compare
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the greatest and smallest of 3 numbers from 1 to 9");
        System.out.println("Enter three numbers from 1 to 9");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((a>b)&&(a>c))
        {
            System.out.println(a+" is greatest");
        }
        else if ((c>b)&&(c>a))
        {
            System.out.println(c+" is greatest");
        }
         else if ((b>c)&&(b>a))
        {
            System.out.println(b+" is greatest");
        }
         if ((a<b)&&(a<c))
        {
            System.out.println(a+" is smallest");
        }
        else if ((c<b)&&(c<a))
        {
            System.out.println(c+" is smallest");
        }
         else if ((b<c)&&(b<a))
        {
            System.out.println(b+" is smallest");
        }
    }
}