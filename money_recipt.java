import java.util.*;
public class money_recipt
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the amount for electricity consumption");
        System.out.println("Enter the unit charge");
        int c=sc.nextInt();
        System.out.println("Enter consumers name");
        String name=sc.next();
        System.out.println("Enter consumers number ");
        long no=sc.nextInt();
        double amount;
        if (c<100)
         amount=5.50*c;
        else if ((c>=100)&&(c<200))
         amount=550+(6.50*(c-100));
        else if ((c>=200)&&(c<300))
         amount=1200+((c-200)*7.50);
        else
         amount=1950+((c-300)*8.50);
        System.out.println("cunsumers name :"+name);
        System.out.println("consumers number :"+no);
        System.out.println("units consumed :"+c);
        System.out.println("amount to be paid :"+amount);
    }
}
