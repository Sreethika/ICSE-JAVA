import java.util.*;
 public class velocity
  {
  public static void main(String args[]) 
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter velocity of train1");
       int v1=sc.nextInt();
       System.out.println("Enter velocity of train2");
       int v2=sc.nextInt();
       System.out.println("Enter length of train1");
       int l1=sc.nextInt();
       System.out.println("Enter length of train2");
       int l2=sc.nextInt();
       int len=l1+l2;
       System.out.println("Enter choice 1.trains are travelling in same direction 2.trains are travelling in opposite direction");
       short ch=sc.nextShort();
       switch(ch)
       {
         case 1:
         float vel=Math.abs(v1-v2);
         System.out.println("Relative velocity is (m/sec)"+vel);
         float time=len/vel;
         System.out.println("Time taken to cross each other is(sec) "+time);
         break;
         case 2:
         vel=v1+v2;
         System.out.println("Relative velocity is (m/sec) "+vel);
         time=len/vel;
         System.out.println("Time taken to cross each other is (sec) "+time);
         break;
         default:
         System.out.println("wrong choice");
       }
    }
}   