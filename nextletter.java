import java.util.*;
public class nextletter
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = in.nextInt();
        if (n > 0 && n < 27)
        {
            char ch = (char)(n + 64);
            System.out.println("Corresponding letter = " + ch);
        }
        else 
        {
            System.out.println("Please enter a number in 1 to 26 range");
        }
    }
}