import java.util.*;
public class triangle_patterns
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 for a triangle and");
        System.out.println("Type 2 for an inverted triangle of alphabets");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();        
        switch (choice) 
        {
            case 1:
                for (int i = 0; i <= n; i++)
                {
                    for (int j = 0; j < i; j++) 
                    {
                        System.out.print(' ');
                    }
                    for (int k = i; k <= n; k++) 
                    {
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 2:
                n += 64;
                for (int i = n; i >= 65; i--)
                {
                    for (int j = 65; j <= i; j++)
                    {
                        System.out.print((char)j);
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