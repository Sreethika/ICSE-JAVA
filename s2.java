public class s2
{
    public static void main (String args[])
    {
       System.out.println("series:1,-3,5,-7,9......");
       int s=1;
        for(int x=1;x<=10;x++)
        {
            s-=2;
            if(x%2!=0)
            System.out.print(Math.abs(s)+" ");
            else 
            System.out.print(s+" ");
        }
    }
}