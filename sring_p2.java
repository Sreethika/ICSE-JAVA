import java.util.*;
public class sring_p2
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a sentence to remove the vowels in it");
    String s=in.nextLine();
    char ch;
    for(int i=0; i<s.length(); i++)
    {
        ch=s.charAt(i);
        ch=Character.toLowerCase(ch);
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        continue;
        else
        System.out.print(ch);
    }
}
}