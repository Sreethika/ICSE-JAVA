import java.util.*;
public class last8
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=in.nextInt();
        int i,j;short n2=0;
        String num=Integer.toString(n);
        char d[]=new char[num.length()];
        for(i=0;i<num.length();i++)
        {
            d[i]=num.charAt(i);
        }
        for(i=0;i<num.length();i++)
        {
            for(j=0;j<num.length();j++)
            {
                if(d[i]==d[j]&&i!=j&&n2==0)
                {
                    System.out.println(d[i]);n=1;n2=1;
                }
            }
            n2=0;
        }
        if(n!=1)
        {
            System.out.println("No digit is repeated");
        }
    }
}