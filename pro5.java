import java.util.*;
public class pro5
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
//this program is divided into diiffernt sections
//inputs of 2 arrays
System.out.println("how many numbers do you want to enter in set 1?(enter less than 20 numbers)");
int z=in.nextInt();
int x1[]=new int[z];
System.out.println("enter the numbers");
for(int i=0;i<z;i++)
x1[i]=in.nextInt();
System.out.println("how many numbers do you want to enter in set 2?(enter less than 20 numbers)");
z=in.nextInt();
int x2[]=new int[z];
System.out.println("enter the numbers");
for(int i=0;i<z;i++)
x2[i]=in.nextInt();
//merging array 1 and 2
z=x1.length+x2.length;
int x3[]=new int[z+5];
for (int i=0;i<x1.length;i++)
x3[i]=x1[i];
for (int i=0;i<x2.length;i++)
x3[i+x1.length]=x2[i];
System.out.println("merged array:");
for(int i=0;i<z;i++)
System.out.print(x3[i]+" ");
System.out.println("");
//inserting
System.out.println("how many numbers do you want to add in the list?(enter less than 5 numbers)");
byte c=in.nextByte();
for(byte i=0;i<c;i++)
{
System.out.println("enter the number you want to add");
int n=in.nextInt();
System.out.println("position in which you want to add");
int p=in.nextInt();
p--;
for(int j=z;j>p;j--)
{
x3[j]=x3[j];
}
x3[p]=n;
System.out.println("array after inserting");
for(int a=0;a<=z;a++)
System.out.print(x3[a]+" ");
System.out.print(" ");
}
}
}
