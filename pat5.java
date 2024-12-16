public class pat5
{
    public static void main(String args[]) 
    {
        int a = 97;
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print((char)a + " ");
            }
            a++;
            if (i == 2)
                a = 65;
            System.out.println();
        }
    }
}