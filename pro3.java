import java.util.*;
public class pro3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i;
int x1[]=new int[5];
int x2[]=new int[5];
int x3[]=new int[5];
System.out.println("Enter 5 numbers");
for(i=0;i<5;i++)
{
x1[i]=in.nextInt();
}
System.out.println("Enter 5 numbers");
for(i=0;i<5;i++)
{
x2[i]=in.nextInt();
}
for(i=0;i<5;i++)
{
x3[i]=x1[i]+x2[i];
}
System.out.println("The sum of consecutive numbers:");
for(i=0;i<5;i++)
System.out.println((x3[i])+"="+(x1[i])+"+"+(x2[i]));
}
}


