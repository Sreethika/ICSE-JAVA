public class patterns
{
    public static void main(String args[])
    {
        String word = "ABCDE";
        for (int i = 0; i < 5; i++) 
        {
            for (int j = i; j < 5; j++) 
            {
                char ch = word.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
        char ch = 'A';        
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(ch++);
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                System.out.print(word.charAt(j));
            }
            for (int k = 0; k < i; k++) 
            {
                System.out.print(word.charAt(k));
            }
            System.out.println();
        }
    }
}