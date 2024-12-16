import java.util.*;
public class sring_p3
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a three-word name");
    String s=in.nextLine();
    char ch; byte x=0;
    for(int i=0;i<s.length();i++)
    {
        ch=s.charAt(i);
        if((i>0)&&(i!=' ')&&((s.charAt(i-1)==' ')))
        System.out.print(Character.toUpperCase(ch)+" ");
     }
   }
}