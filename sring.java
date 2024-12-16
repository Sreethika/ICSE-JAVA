import java.util.*;
public class sring
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a simple sentence to correct spaces");
    String s=in.nextLine();
    char ch[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
        ch[i]=s.charAt(i);
        if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i>0)))  
        System.out.print(" ");
        if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i>0)))  
        System.out.print(ch[i]);
        else if((ch[i]!=' '))
        System.out.print(ch[i]);
    }
}
}