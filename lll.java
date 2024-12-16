import java.util.*;
public class lll
{
public static void main (String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter 20 integer elements to display prime numbers");
System.out.print("");
int x[]=new int[20];
int y;
int c,c2=0;
int p[]=new int[20];
for(y=0;y<20;y++)
{
c=0;    
x[y]=in.nextInt();
for(int a=1;a<=x[y];a++)
{
if(x[y]%a==0)
c++;  
}
if (c==2)
p[y]=x[y];
else 
p[y]=0;
}
System.out.println("the prime numbers");
for(y=0;y<20;y++)
if(p[y]==0)
System.out.print(" ");
else
System.out.print(p[y]+" ");
}
}


