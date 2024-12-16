import java.util.*;
public class anisha

{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("Say Something o.O");
    String w[]=new String[100];
    String n=in.nextLine();int c=0;int j=0;int i=0;int x=0;
    do
    {
        char ch=n.charAt(i);      
        if(ch==' ')
        {
            w[x]=n.substring(j,i);
            x++;
            j=i++;
        }
        if(i==n.length()-1)
        {
            w[x]=n.substring(j);break;
        }
        i++;
    }
    while(i<n.length());
    String longest="";
    for(i=0;i<x+1;i++)
    {
         longest=w[i].length()>longest.length()?w[i]:longest;        
    }
    if(longest==w[0])
    {
    System.out.println("The longest word is "+longest+" \n Number of letters= "+(longest.length()));
    }
    else 
    {
    System.out.println("The longest word is "+longest+" \n Number of letters= "+(longest.length()-1));
    }
}
}