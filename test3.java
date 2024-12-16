import java.util.*;
public class test3
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a word to prient each letters ascii code and their sum");
    String s=in.nextLine();
    char ch; int sum=0;
    int z=s.length();
    for(int i=0; i<z;i++)
    {
      ch=s.charAt(i);
      sum=sum+(int)ch;
      System.out.println("ascii code of "+ch+" is "+(int)ch);
    }
          System.out.println("ascii sum="+sum);

}
}
