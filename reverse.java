import java.util.*;
public class reverse
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a letter: ");
       char l = in.next().charAt(0);
       int a = (int)l;
       System.out.println("ASCII Code = " + a);
       int r = 0;
       while (a > 0) 
       {
           int digit = a % 10;
           r = r * 10 + digit;
           a /= 10;
       }
       System.out.println("Reversed Code = " + r);
       System.out.println("Equivalent character = " + (char)r);
   }
}