import java.util.*;
public class deletion
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
        System.out.println("enter element to be deleted");
        ele=in.nextInt();
        System.out.println("enter position of deletion");
        pos=in.nextInt();
        for(i=pos+1;i<n;i++)
        arr[i-1]=arr[i];
        n--;
        System.out.println("array elements after deletion");
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}