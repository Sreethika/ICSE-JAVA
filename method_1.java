import java.util.*;
public class method_1
{
   Scanner in=new Scanner(System.in);
   int n2,s=0,d;
   public int amstrong(int n)
   {
     n2=n;
     while(n!=0)
     {
      d=n%10;
      s=s+((int)(Math.pow(d,3)));  
      n=n/10;
     }
     if(s==n2)
     n=1;
     else
     n=0;
     return n;
    }
   public static void main(String args[])
   {
     Scanner in=new Scanner(System.in);
     int d,s,n2=0;
     System.out.println("enter a number to check if it is an amstrong number or not");
     int n=in.nextInt();
     method_1 ob=new method_1();
     n2=ob.amstrong(n);
     if(n2==1)
     System.out.println(n+" is an amstrong number");
     else
      System.out.println(n+" is not an amstrong number");
    }
}                         