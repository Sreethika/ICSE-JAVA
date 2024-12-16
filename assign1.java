public class assign1
{
    public static void main(String args[])
    {
        char a='a';
        for(int i=1; i<=5;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(a++);
            }
            a='a';
            System.out.println();
        }
    }
}