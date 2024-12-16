public class pattern2
{
    public static void main(String args[])
    {
        for(int i=7; i>=1; i-=2)
        {
            for(int j=1; j<=i; j=j+1)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}