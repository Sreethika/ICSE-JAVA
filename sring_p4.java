import java.util.*;
public class sring_p4
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a three-word name");
    String s=in.nextLine();
    String s2=" ";
    char ch; int x=0;
    s=s.trim();
    for(int i=0;i<s.length();i++)
    {
        ch=s.charAt(i);
        if((i>0)&&(ch!=' ')&&(s.charAt(i-1)==' '))
        ++x;
        if (x==2)
        s2=s2+ch;    
    }
    x=0;
    int x2;
    s2=" "+s2+" ";
    for(int i=0;i<s.length();i++)
    {
        ch=s.charAt(i);
        if(s.charAt(0)!=' ')
        x2=1;
        else
        x2=2;
        if((i>0)&&(ch!=' ')&&(s.charAt(i-1)==' ')&&(x<=x2))
        {
        s2=s2+" "; 
        x=x+1;
        }
        if((ch!=' ')&&(x<=x2))
        s2=s2+ch;
    }
    System.out.println(s2.trim());    
 }
}