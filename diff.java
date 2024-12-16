import java.util.*;
public class diff
{
    public static void main (String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char ch1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2 = in.next().charAt(0); 
        int d = (int)ch1 - (int)ch2;
        if (d > 0)
            System.out.println("Second character is smaller");
        else if (d < 0)
            System.out.println("First character is smaller");
        else
            System.out.println("Both the characters are same");
    }
}