import java.util.*;
public class upper_lower
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter '1' to display upper case letters");
        System.out.println("Enter '2' to display lower case letters");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();     
        switch (ch) {
            case 1:
            for (int i = 65; i <= 69; i++)
                System.out.println((char)i);
            break;           
            case 2:
            for (int i = 118; i <= 122; i++)
                System.out.println((char)i);
            break;          
            default:
            break;
        }
    }
}