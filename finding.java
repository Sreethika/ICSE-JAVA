import java.util.*;
public class finding
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character to find the 10th character from it");
        char ch=sc.next().charAt(0);
        ch=(char)((int)ch+10);
        System.out.println("ans:"+ch);
    }
}
