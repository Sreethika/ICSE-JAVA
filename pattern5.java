public class pattern5
{
    public static void main(String args[])
    {
        int x=0;
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            System.out.print(j+" ");
            for(int j=1; j<=x; j++)
            System.out.print("  ");           
            for(int j=i; j>=1; j--)
            System.out.print(j+" ");
            System.out.println();
            x+=2;
        }
        System.out.println();
    }
}