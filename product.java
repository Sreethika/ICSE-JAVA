import java.util.*;
public class product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 25 numbers");
        int array[]=new int[25];int p=1;
        for (int i=0; i<=24; i++)
        array[i]=sc.nextInt();
        for (int i=0; i<=24; i++)        
        if (i% 2!=0)
        p= p*array[i];
        System.out.println("Product of subscripted"+p);
}
}

    