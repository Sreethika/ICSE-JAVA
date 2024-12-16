import java.util.*;
public class packages
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter o for ordinary booking and e for express booking");
        char x=sc.next().charAt(0);
        System.out.println("Enter the weight of the parcel in grams");
        double c=sc.nextInt();
        double amount;
        switch (x)
        {
         case 'o':
         if (c<=100)
          amount=80;
         else if ((c>100)&&(c<501))
          amount=150;
         else if ((c>500)&&(c<1001))
          amount=210;
         else
          amount=250;
         System.out.println("amount to be paid is "+amount);
         break;
         case 'e':
         if (c<=100)
          amount=100;
         else if ((c>100)&&(c<501))
          amount=200;
         else if ((c>500)&&(c<1001))
          amount=250;
         else
          amount=300;
         System.out.println("amount to be paid is "+amount);
         break;
         default:
         System.out.println("invalid charecter entered.Please try entering lower case alphabets");
        }
    }
}
