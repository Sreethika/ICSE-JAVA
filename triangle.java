import java.util.*;
public class triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for a triangle and 2 for an inverted triangle");
        int x=sc.nextInt();
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        switch (x)
        {
            case 1:
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                System.out.print(i);
                System.out.println();
            }
            break;
            case 2:
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                System.out.print(i);
                System.out.println();
            }
            break;
            default:
            System.out.println("invalid input");
        }
    }
}