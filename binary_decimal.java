import java.util.*;
public class binary_decimal
{
    public void number()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to display number in Binary Equivalent");
        System.out.println("Enter 2 to display number in Decimal Equivalent");
        System.out.print("Enter your choice: ");
        int c = in.nextInt();
        in.nextLine();
        switch (c) {
            case 1:
            System.out.print("Enter a decimal number: ");
            int num = in.nextInt();
            System.out.println("Binary Equivalent");
            System.out.println(Integer.toBinaryString(num));
            break;
            
            case 2:
            System.out.print("Enter a binary number: ");
            String bin = in.nextLine();
            System.out.println("Decimal Equivalent");
            System.out.println(Integer.parseInt(bin, 2));
            break;
            
            default:
            System.out.println("Incorrect Choice");
            break;
        }
    }
}