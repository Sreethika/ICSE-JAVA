public class p3
{
    public static void main(String args[])
    {
        int x=16;
        for(short r=5;r>=1;r--)
        { 
           for(short c=1;c<=r;c++)
           {
            x--;   
            System.out.print(x+" ");
           }
            System.out.println();
        }
    }
}