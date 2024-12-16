public class s1
{
    public static void main (String args[])
    {
       System.out.println("series:0,1,2,3,6......");
       int a=0; 
       int b=1;
       int c=2;
       int s;
       System.out.print(a+" "+b+" "+c);
        for(int x=1;x<=10;x++)
        {
            s=a+b+c;
            System.out.print(s+" ");
            a=b;
            b=c;
            c=s;
        }
    }
}