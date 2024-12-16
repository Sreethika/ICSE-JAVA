import java.util.*;
public class pythogoran_triplet
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display a pythogoran triplet closer to it");
        int m=sc.nextInt();
        System.out.println("The pythogoran triplet is "+(2*m)+", "+((m*m)+1)+", "+((m*m)-1));
    }
}