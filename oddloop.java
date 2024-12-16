public class oddloop
{
    public static void main(String args[])
    {
        int x=7;
        for(short r=1;r<=4;r++)
        { 
           for(short c=1;c<=x;c++)
           {
            System.out.print(c+" ");
           }
           System.out.println();
           x-=2;
        }
    }
}