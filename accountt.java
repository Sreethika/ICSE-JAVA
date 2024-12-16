import java.util.*;
public class accountt
{
   long acc;
   int amount;
   byte i;
   public void details()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your account number");
      acc=sc.nextInt();
      account ob=new account();
      ob.details();
      for(i=0; i<9; i++)
      {
          if (acc==ob.acc_number[i])
          break;
      }
   }
   private void deposit()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount you are depositing"); 
      amount=sc.nextInt();
      account ob=new account();      
      ob.balance[i]+=amount;
   }
   private void withdraw()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount you want to withdraw"); 
      amount=sc.nextInt();
      account ob=new account();      
      ob.balance[i]-=amount;
   }
   private void display()
   {
       account ob=new account();      
       System.out.println("name              :"+ob.name[i]);
       System.out.println("account number    :"+ob.acc_number[i]);
       System.out.println("balance           :"+ob.balance[i]);
   }   
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      accountt obj=new accountt();
      obj.details();
      System.out.println("enter the action you want to perform");
      System.out.println("1- withdraw cash");
      System.out.println("2- deposit cash");
      System.out.println("3- check account status");
      System.out.println("4- exit");
      byte x=sc.nextByte();
      switch(x)
      {
        case 1:
        obj.withdraw();
        obj.display();
        break;
        case 2:
        obj.deposit();
        obj.display();
        break;
        case 3:
        obj.display();
        break;
        case 4:
        System.out.println("***thank you***");
        break;
        default:
        System.out.println("**invalid**");
      }
    }
}