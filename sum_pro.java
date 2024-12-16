import java.util.*;
public class sum_pro
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 integers");
        long sum = 0, prod = 1;
        for (int i = 0; i < 10; i++)
        {
            int n = in.nextInt();
            sum += n;
            prod *= n;
        }       
        String s = Long.toString(sum) + Long.toString(prod);
        long r = Long.parseLong(s);       
        System.out.println("Concatenated Number = " + r);
    }
}