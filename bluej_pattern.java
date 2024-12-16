public class bluej_pattern
{
    public static void main(String args[]) 
    {
        String word = "BLUEJ";
        for (int i = 4; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++) 
            {
                char ch = word.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 4; i >= 0; i--)
        {
            for (int j = 4; j >= i; j--)
            {
                char ch = word.charAt(i);
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++)
        {
            for (int j = i; j < 5; j++)
            {
                char ch = word.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();        
    }
}