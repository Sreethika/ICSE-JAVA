import java.util.*;
public class wordL
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("Say Something o.O");
    String w[]=new String[100];
    String n=in.nextLine();int c=0;int j=0;int i=0;int x=0;
    int z=n.length();
    do
    {
        char ch=n.charAt(i);
        if((ch==' ')||(i==z--))
        {
            w[x]=n.substring(j,i);
            x++;
            j=i++;
        }
        i++;
    }
    while(i<z);
    String longest="";
    for(i=0;i<x;i++)
    {
         longest=w[i].length()>longest.length()?w[i]:longest;        
    }
    System.out.println("The longest word is "+longest+" \n Number of words= "+(x++));
}
}
