import java.util.*;
public class words_letters
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       int wCount = 0, lCount = 0;
       int len = str.length();
       for (int i = 0; i < len; i++)
       {
           char ch = str.charAt(i);
           if (ch == ' ')
               wCount++;
           else
               lCount++;
       }
       wCount++;
       System.out.println("No. of words = " + wCount);
       System.out.println("No. of letters = " + lCount);
   }
}