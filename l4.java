import java.util.*;
public class l4
{
public static void main (String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter 10 decimal elements");
System.out.print("");
float x[]=new float[10];
int y;
for(y=0;y<10;y++)
{
x[y]=in.nextFloat();
System.out.print("");
}
for(y=0;y<10;y++)
{
System.out.println(x[y]);   
}
}
}


