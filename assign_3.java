import java.util.*;
public class assign_3
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string in uppercase:");
        String str = in.nextLine();
        String newStr = "";
        int len = str.length();
        for (int i = 0; i < len; i++)
        {
            char ch = str.charAt(i);
            if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') 
            {
               continue;
            }
            else 
            {
                newStr = newStr + ch;
            } 
        }        
        System.out.println(newStr);
    }
}