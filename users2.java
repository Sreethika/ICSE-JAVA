import java.util.*;
public class users2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 for inverted triangle and 1 for normal triangle");
        short y=sc.nextShort();
        System.out.println("enter the number of terms");
        int x=sc.nextShort();
        int s;
        switch(y)
        {
            case 1:
            s=1;
            for(int x1=1;x1<=x;x1++)
            {
                for(int y1=1;y1<=x1;y1++)
                {
                    System.out.print(s+" ");
                }
                System.out.println(" ");
                s++;
            }
            break;
            case 2:
            s=x;
            for(int x1=x;x1>=1;x1--)
            {
                for(int y1=1;y1<=x1;y1++)
                {
                    System.out.print(s+" ");
                }
                System.out.println(" ");
                s--;
            }
            break;
            default:
            System.out.println("invalid input.");
        }
    }
}
