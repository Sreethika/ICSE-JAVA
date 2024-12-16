import java.util.*;
public class prime2
{
    public int check(int n)
    {
        int i;short c=0;
        for(i=2;i<n;i++)
        {
           if(n%i==0)
           {
            c=0;
            break;
           }
          else
          c=1;          
        }
        return c;
}
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        prime2 ob=new prime2();
        int sol;
        sol=ob.check(n);
        if (sol==1)
        System.out.println(n+"is a prime number");
        else
        System.out.println(n+"is not a prime number");
    }
}


