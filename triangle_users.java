import java.util.*;
public class triangle_users
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 for a triangle and");
        System.out.println("Type 2 for an inverted triangle");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        in.nextLine();
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        int len = word.length();        
        switch (choice)
        {
            case 1:
                for(int i = 0; i < len; i++)
                {
                    for(int j = 0; j <= i; j++) 
                    {
                        System.out.print(word.charAt(i));
                    }
                    System.out.println();
                }
                break;
                
            case 2:
                for(int i = len - 1; i >= 0; i--)
                {
                    for(int j = 0; j <= i; j++)
                    {
                        System.out.print(word.charAt(j));
                    }
                    System.out.println();
                }
                break;
                
            default:
                System.out.println("Incorrect choice");
                break;
        }
    }
}