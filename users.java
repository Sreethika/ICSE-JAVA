import java.util.*;
public class users
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter f for fibonanci series and s for sum of digits");
        char x=sc.next().charAt(0);
         switch (x)
        {
            case 'f':
            int a=1,b=1;
            int s=2;
            System.out.print(a+" "+b);
            for(int q=1;q<=20;q++)
            {
             s=a+b;    
             System.out.print(" "+s);
             a=b;
             b=s;
            }
            break;
            case 's':
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int sum=0,d=0;
            while(n!=0)
            {
              d=n%10;
              sum=sum+d;
              n=n/10;
            }
            System.out.println("sum of the digits "+sum);
            break;
            default:
            System.out.println("invalid charecter entered.Please try entering lower case alphabets");
        }
     }
    
}
