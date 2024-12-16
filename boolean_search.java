import java.util.*;
public class boolean_search
{
    public boolean search(int m[],int ns)
    {
        int i;
        boolean p=false;
        for(i=0;i<10;i++)
        {
            if(m[i]==ns)
            p=true;
        }
        return (p);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,ns;
        int m[]=new int[10];
        boolean y;
        boolean_search ob=new boolean_search();
        for(i=0;i<10;i++)
        {
            System.out.print("enter your marks");
            m[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        ns=sc.nextInt();
        y=ob.search(m,ns);
        if (y==true)
            System.out.println("the search is sucessful");
        else
            System.out.println("the search is unsucessful");
        }
    }