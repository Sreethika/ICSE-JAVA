import java.util.*;
public class Series
{
    int sum(int a)
    {
        int i,s=0;
        for(i=1;i<a;i++)
        s=(s+(i+1));
        return(s);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p,n;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        Series ob= new Series();
        p=ob. sum(n);
        System.out.println("the sum of the series is" +p);
    }
}