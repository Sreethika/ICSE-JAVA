import java.util.*;
public class pro2
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,c=0;
int marks[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter student "+(i+1)+" marks");
marks[i]=in.nextInt();
}
for(i=0;i<10;i++)
{
if(marks[i]>=80)
c++;
}
System.out.println("The number of students who got 80 and above="+c);
}
}