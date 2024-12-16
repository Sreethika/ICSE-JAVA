import java.util.*;
public class replace_vowel
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.nextLine();
        str = str.toLowerCase();
        String newStr = "";
        int len = str.length();
        for (int i = 0; i < len; i++)
        {
            char ch = str.charAt(i);
            if (str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') 
            {

                char nextChar = (char)(ch + 1);
                newStr = newStr +  nextChar; 

            }
            else 
            {
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }
}