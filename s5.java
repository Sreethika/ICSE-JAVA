public class s5
{
    public static void main (String args[])
    {
       System.out.println("series:1,12,123,1234,.......");
       int s=0;
       int p=10;
        for(int x=1;x<=10;x++)
        {
            s=s*p+x;
            System.out.print(s+" ");
        }
    }
}