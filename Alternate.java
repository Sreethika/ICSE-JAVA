public class Alternate
{
    public static void main(String args[]) 
    {
        System.out.println("generating alternate numbers:");
        for (char ch = 'A'; ch <= 'Z'; ch = (char)(ch + 2)) 
        {
            System.out.println(ch);
        }
    }
}