public class floyds
{
    public static void main(String args[])
    {
        short x=1;
        for(short r=1;r<=5;r++)
        { 
           for(short c=1;c<=r;c++)
           {
            System.out.print(x+" ");
            x++;
           }
            System.out.println();
        }
    }
}