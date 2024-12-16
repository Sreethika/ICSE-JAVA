import java.util.*;
public class max_min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,min,max;
        int m[]=new int[10];
        for( i=0;i<10;i++)
        {
            System.out.println("enter number in the cell");
            m[i]=sc.nextInt();
        }
        max=m[0];
        min=m[0];
        for(i=0;i<10;i++)
        {
            if(m[i]>max)
            max=m[i];
            if(m[i]<min)
            min=m[i];
        }
        System.out.println("greatest:"+max);
        System.out.println("smallest:"+min);
    }
}