import java.util.*;
public class repeated_task
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m for ordinary repeated multiplication and d for repeated division");
        char x=sc.next().charAt(0);
        System.out.println("Enter the numbers (the first number should be greater)");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int q=0,p=0;int d;
         switch (x)
        {
            case 'm':
            for(int q1=1;q1<=b;q1++)//initialisation
             p=p+a;
            System.out.println("product is "+p);//instanciation
            break;//moving out if this is the true module
            case 'd':
            d=a/b;
            for(int q1=1;q1<=d;q1++);
            {
              a=a-b;
              q=q+1;
            }
            System.out.println("quotient is "+q);
            System.out.println("remainder is "+a);
            break;
            default:
            System.out.println("invalid charecter entered.Please try entering lower case alphabets");
        }
     }
}
