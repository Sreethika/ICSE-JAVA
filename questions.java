import java.util.*;
public class questions
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TWO QUESTIONS");
        System.out.println("think of an object, i will try to guess it");
        System.out.println();
        System.out.println("QUESTION 1: is it an animal, mineral or vegetable?");
        String x=sc.nextLine();
        x=x.toLowerCase();
        System.out.println(); 
        String y;
        switch (x)
        {
            case "animal":
            System.out.println("QUESTION 2: is it bigger than breadbox? (yes/no)");
            y=sc.nextLine();
            y=y.toLowerCase();
            if(y=="yes")
            System.out.println("I guess that you are thinking of a moose.");
            if(y=="no")
            System.out.println("I guess that you are thinking of a squirrel.");
            System.out.println("I would ask you if I'm right, but I don't care.");
            break;
            case "mineral":
            System.out.println("QUESTION 2: is it bigger than breadbox? (yes/no)");
            y=sc.nextLine();
            y=y.toLowerCase();
            if(y=="yes")
            System.out.println("I guess that you are thinking of a paper clip.");
            if(y=="no")
            System.out.println("I guess that you are thinking of a camaro.");
            System.out.println("I would ask you if I'm right, but I don't care.");
            break;
            case "vegetable":
            System.out.println("QUESTION 2: is it bigger than breadbox? (yes/no)");
            y=sc.nextLine();
            y=y.toLowerCase();
            if(y=="yes")
            System.out.println("I guess that you are thinking of a carrot.");
            if(y=="no")
            System.out.println("I guess that you are thinking of a watermelon.");
            System.out.println("I would ask you if I'm right, but I don't care.");
            break;
            default:
            System.out.println("QUESTION 2: is it bigger than a breadbox?");
            System.out.println("nevermind, i am tired, try again next time");
        }
        System.out.println();
        System.out.println("thank you for staying till THE END");
    }
}