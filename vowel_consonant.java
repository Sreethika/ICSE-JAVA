import java.util.*;
public class vowel_consonant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 20 letter to find the vowel and consonant count");
        int vc=0,cc=0;
         for(int i=0; i<=20; i++)
        {
            char ch=sc.next().charAt(0);
            if(((Character.toUpperCase(ch)=='A')||(Character.toUpperCase(ch)=='U')||(Character.toUpperCase(ch)=='E')||(Character.toUpperCase(ch)=='I')||(Character.toUpperCase(ch)=='O')))
            vc++;
            else 
            cc++;
        }
        System.out.println("vowel count:"+vc);
        System.out.println("consonant count:"+cc);
    }
}