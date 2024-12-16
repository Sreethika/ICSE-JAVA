import java.util.*;
public class sring_p1
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a simple sentence to print number of characters and words");
    System.out.println("max characters : 50");
    String s=in.nextLine();
    short c=0; short c2=0; char ch[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
        ch[i]=s.charAt(i);
        if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i>0)))  
        c2++;
        if(ch[i]!=' ')
        c++;
    }
    System.out.println("number of characters are "+c);
    System.out.println("number of words are "+c2);
  }
}