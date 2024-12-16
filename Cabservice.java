import java.io.*;
class Cabservice
{
String taxino,name;
int d,amt;
Cabservice()
{
taxino = "";
name = "";
d = 0; amt = 0;
}
void input() throws IOException
{ 
InputStreamReader read=new  InputStreamReader(System.in);
BufferedReader in =new BufferedReader(read);
System.out.println("enter taxi number");
taxino=in.readLine();
System.out.println("enter passenger name");
name=in.readLine(); 
System.out.println("enter distance travelled");
d=Integer.parseInt(in.readLine());
}
void calculate()
{
if(d<=1)
amt=25; 
if(d>1&&d<=5)
amt=d*30; 
if(d>5&&d<=10)
amt=d*35; 
if(d>10&&d<=20)
amt=d*40;
if(d>20)
amt=45*d;
}
void display()
{
System.out.println("taxi no"+"\t"+"name"+"\t"+"\t"+"distance"+"\t"+"bill");
System.out.println(taxino+"\t"+name+"\t"+d+"\t\t"+amt);
}
public static void main (String args[])throws IOException
{
Cabservice ob =new Cabservice();
ob.input();
ob.calculate();
ob.display();
}
}    
    