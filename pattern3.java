public class pattern3
{
    public static void main(String args[])
    {
        int x=0;
        for(int i=5; i>=1; i--)
        {
            for (int j=0; j<x; j++)
            {
                System.out.print("  ");
            }
            for (int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            x++;
            System.out.println();
        }
        System.out.println();
    }
}