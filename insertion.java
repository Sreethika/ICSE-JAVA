import java.util.*;
public class insertion
{
    public static void main(String args[])
    {
        int i, n, ele, pos;
        int arr[]=new int[50];
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of array elements");
        n=in.nextInt();
        System.out.println("enter array elements");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.println("enter element to be inserted");
        ele=in.nextInt();
        System.out.println("enter position of insertion");
        pos=in.nextInt();
        for(i=n-1;i>=pos;i--)
        arr[i+1]=arr[i];
        arr[pos]=ele;
        n++;
        System.out.println("array elements after insertion");
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}