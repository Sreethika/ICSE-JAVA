import java.util.*;
public class asc_des
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length / 2 - 1; i++)
        {
            for (int j = 0; j < arr.length / 2 - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }  
        }
        for (int i = 0; i < arr.length / 2 - 1; i++) 
        {
            for (int j = arr.length / 2; j < arr.length - i - 1; j++)
            {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }  
        }
        System.out.println("\nSorted Array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}