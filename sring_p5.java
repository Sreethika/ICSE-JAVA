import java.util.*;
public class sring_p5
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a sentence to print longest word and its length");
    String s=in.nextLine();
    char ch;byte c2;String st2=" ";int c=0;int max=0;
    for(int i=0;i<s.length();i++)
    {
        ch=s.charAt(i);
        if(ch!=' ')
        {
        c+=1;
        st2=st2+ch;
        if((ch!=' ')&&(s.charAt(i-1)==' ')&&(i>0)||((ch!=' ')&&(i==0)))
        {
        if(c>max)
        st2=" ";
        max=Math.max(max,c);
        c=0;
        }
        }
        System.out.println("enter a sente longest word and its length");
    }
 }
}