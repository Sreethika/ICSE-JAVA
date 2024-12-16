public class s3
{
    public static void main (String args[])
    {
       System.out.println("series:1,3,8,15,.......");
       int s=0;
       int o=3;
        for(int x=1;x<=10;x++)
        {
            System.out.print(s+" ");
            s=s+o;
            o=o+2;
        }
    }
}