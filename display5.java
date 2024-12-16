import java.util.*;
public class display5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("write a character, to print its next 5 characters");
        char ch=sc.next().charAt(0);
        System.out.println("the next 5 characters");
        for(int i=0; i<=5; i++)
           System.out.println((char)((int)ch+i));
    }
}