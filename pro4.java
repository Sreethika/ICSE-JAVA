import java.util.*;
public class pro4
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter 10 numbers");
int i;
int x[]=new int[10];
for(i=0;i<10;i++)
{
x[i]=in.nextInt();
}
System.out.println("the numbers preceding odd numbers:");
for(i=1;i<10;i++)
{
if(x[i]%2!=0)
System.out.println(x[i-1]);
}
}
}