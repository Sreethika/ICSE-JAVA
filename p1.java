public class p1
{
    public static void main(String args[])
    {
        for(short r=1;r<=9;r+=2)
        { 
           for(short c=r;c>=1;c-=2)
           {
            System.out.print(c+" ");
           }
            System.out.println();
        }
    }
}