import java.io.*;
public class Marks_cons
{
String name;
int age,m1,m2,m3,max;
double avg;
Marks_cons(String n, int d, int a, int b, int c)
{
name=n;
age=d;
m1=a;
m2=b;
m3=c;
}
void compute()
{
avg=(m1+m2+m3)/3;
if(m1>m2 && m1>m3)
     max=m1;
if(m2>m1 && m2>m3)
     max=m2;
if(m3>m1 && m3>m2)
     max=m3;
    }
void display()
{
System.out.println("Name :"+ name);
System.out.println("Age :"+age+ "years");
System.out.println("Marks in three subjects :"+" " +m2+" "+m3);
System.out.println("The highest marks in three subjects :"+max);
System.out.println("The average marks :"+ avg);
}
public static void main(String args[]) throws IOException
{
InputStreamReader read =new InputStreamReader(System.in);
BufferedReader in =new BufferedReader(read);
String nm;
int ag,a1,b1,c1;
System.out.println("Enter student's name,age,Marks in three subjects one by one");
nm=in.readLine();
ag=Integer.parseInt(in.readLine());
a1=Integer.parseInt(in.readLine());
b1=Integer.parseInt(in.readLine());
c1=Integer.parseInt(in.readLine());
Marks_cons ob=new Marks_cons(nm,ag,a1,b1,c1);
ob.compute();
ob.display();
}
}
