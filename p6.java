public class p6
{
    public static void main(String args[])
    {
        int x=0;
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=r;c++)
            {
                x++;
                System.out.print(x+" ");//printing in the same line
            }
            System.out.println();//moving on to next line
        }
    }
}