public class pat3
{
    public static void main(String args[]) 
    {
        for (int i = 69; i >= 65; i = i - 2) 
        {
            for (int j = 65; j <= i; j++) 
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}