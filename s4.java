public class s4
{
    public static void main (String args[])
    {
       System.out.println("series:1,11,111,1111,.......");
       int s=1;
       int p=10;
        for(int x=1;x<=10;x++)
        {
            System.out.print(s+" ");
            s=s*p+1;
        }
    }
}