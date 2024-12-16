import java.util.*;
public class Electricity
{
double cal(int u)
{
double c=0.0D;
if(u<=100)
c=(u*1.25);
if((u>100)&&(u<=200))
c=((100*1.25)+(u-100)*1.50);
if(u>200)
c=((100*1.25)+(100*1.50)+(u-200)*1.80);
return(c);
}
public static void main (String args[])
{
int prev,pres,un,cn;
double amt=0.0D;
String name;
Scanner in=new Scanner(System.in);
Electricity ob=new Electricity();
System.out.println("Enter consumer's name");
name=in.nextLine();
System.out.println("enter consumer's number");
cn=in.nextInt();
System.out.println("Enter previous reading");
prev=in.nextInt();
System.out.println("Enter present reading");
pres=in.nextInt();
un=pres-prev;
amt=ob.cal(un);
System.out.println(cn+"\t\t "+name+"\t"+un+"\t+"+amt);
}
}
  
