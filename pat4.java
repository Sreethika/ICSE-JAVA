public class pat4
{
    public static void main(String ars[])
    {
        for (int i = 86; i >= 80; i = i - 2) 
        {
            for (int j = 80; j <= i; j = j + 2)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}