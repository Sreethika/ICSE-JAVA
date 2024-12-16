import java.util.*;
public class bus
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To calculate fair");
        System.out.println("Enter the distance travelled");
        int c=sc.nextInt();
        double amount;
        if (c<=10)
         amount=80;
        else if ((c>10)&&(c<21))
         amount=80+(6*(c-10));
        else if ((c>20)&&(c<31))
         amount=140+((c-20)*5);
        else
         amount=190+((c-30)*4);
        System.out.println("amount to be paid is "+amount);
    }
}
