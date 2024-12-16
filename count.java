import java.util.*;
public class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many characters do you want to enter?");
        int n=sc.nextInt();
        System.out.println("enter 10 characters to count upper case and lower case letters");
        int uc=0, lc=0;
        for(int i=0; i<=n; i++)
        {
          char ch=sc.next().charAt(0);
          if (Character.isUpperCase(ch)==true)
          uc++;
          else if (Character.isLowerCase(ch)==true)
          lc++;
        }
        System.out.println("lower case letters:"+lc);
        System.out.println("upper case letters:"+uc);
    }
}  