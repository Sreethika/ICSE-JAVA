import java.util.*;
public class pro1
{
  public static void main (String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter 10 int elements");
    int x[]=new int[10];
    for (int i=0;i<10;i++) //took input
     x[i]=in.nextInt();
    for(int j=0;j<5;j++)//loop for first five elements
    {
      System.out.println("factors of "+(j+1)+" number from the array");
        for (int i=0; i<10;i++)//loop for the elements of array
        {
          if (x[i]==0)//if divisor is 0 there will be logical error
          continue;
          if (x[j]<x[i])//if divisor is greator it cant be a factor
          continue;
          if (x[j]%x[i]==0)
           System.out.println(x[i]);
        }
     }
   }
}
