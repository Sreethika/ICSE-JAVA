import java.util.*;
public class duck
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display wheather it is a duck number or not");
        int n=sc.nextInt();
        int n2=n;
        int d;
        int s=0;
        do
        {
          d=n%10;
          n=n/10;
        }while((d!=0)&&(n>9));
        if(d==0)
        System.out.println("the entered number is a duck number");
        else 
        System.out.println("the entered number is not a duck number");
    }
}