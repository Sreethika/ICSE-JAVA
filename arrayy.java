import java.util.*;
public class arrayy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]={2,5,4,1,3};
        int min=x[0];
        int max=x[0];
        int sum=0;
        for(int i=0;i<=4;i++)
        {
            if (x[i]>max)
            max=x[i];
            if (x[i]<min)
            min=x[i];
            sum+=x[i];
        }
        System.out.println("minimum value:"+min);
        System.out.println("maximum value:"+max);
        System.out.println("sum of the elements:"+sum);
    }
}