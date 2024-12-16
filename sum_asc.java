import java.util.*;
public class sum_asc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter 10 letters to print the sum of ascII values");
        int sum=0;
        for(int i=0; i<=10;i++)
        {
           char ch=sc.next().charAt(0);
           sum=sum+(int)ch;
        }
        System.out.println(sum+" is the sum of the ascII code of the entered characters");
    }
}