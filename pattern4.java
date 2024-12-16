public class pattern4
{
    public static void main(String args[])
    {
         int x=2;
         for(int i=1; i<=5; i++)
        {
            for(int j=1 ;j<=i; j++)
            {
                System.out.print(i+" ");
            }
            for(int j=x; j<=5; j++)
            {
                System.out.print(j+" ");
            }
            x++;
            System.out.println();
        }
        System.out.println();
    }
}