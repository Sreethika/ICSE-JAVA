import java.util.*;
public class days
{
    public void daysoftheweek(int daysno)
    {
        switch (daysno)
        {
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("invalid input");
        }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number to print corresponding day of the week");
       int n=sc.nextInt();
       days object=new days();
       object.daysoftheweek(n);
    }
} 