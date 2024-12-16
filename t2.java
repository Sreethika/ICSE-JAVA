

public class t2
{
    public static void main(String args[])
    {
        char a='A'; char a2='A'; 
        for (byte i =0; i<=4; i++) 
        {
            for (byte j=0; j<5-i; j++) {
                System.out.print(a++);
            }
            for(byte j2=0; j2<i; j2++)
                System.out.print(a2++);
            System.out.println();
            a='A'; a2='A'; 
        }
    }
}