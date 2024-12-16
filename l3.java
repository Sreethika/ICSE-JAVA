import java.util.*;
public class l3
{
public static void main (String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter 10 string elements");
System.out.print("");
String x[]=new String[10];
int y;
for(y=0;y<10;y++)
{
x[y]=in.nextLine();
System.out.print("");
}
for(y=0;y<10;y++)
{
System.out.println(x[y]);   
}
}
}


