import java.util.*;
public class compare_overload
{
    public void compare(int a, int b)
    {
        System.out.println(a > b ? a : b);
    }
    public void compare(char a, char b) 
    {
        int x = (int)a;
        int y = (int)b;
        System.out.println(x > y ? a : b);
    }    
    public void compare(String a, String b) 
    {
        System.out.println(a.length() > b.length() ? a : b);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        compare_overload obj = new compare_overload();
        System.out.print("Enter first integer: ");
        int n1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = in.nextInt();
        obj.compare(n1, n2);
        System.out.print("Enter first character: ");
        char c1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        char c2 = in.next().charAt(0);
        in.nextLine();
        obj.compare(c1, c2);
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter second string: ");
        String s2 = in.nextLine();
        obj.compare(s1, s2);
    }
}