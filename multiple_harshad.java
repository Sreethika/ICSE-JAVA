import java.util.*;
public class multiple_harshad
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To find if the entered number is a multiple harshad or not");
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n2=n;
        int d,div,div2;
        int s=0;
        while(n2!=0)
          {
              d=n2%10;
              s=s+d;
              n2=n2/10;
          }
        div=n2%s;
        div2=div;
        if(div==0)
         {
            while(div!=0)
             {
                d=div%10;
                s=s+d;
                div=div/10;
             }
            if(div2%s==0)
            System.out.println("the entered number is a multiple harshad number");
            else
            System.out.println("the entered number is not a multiple harshad number");
        }     
    }
}
 