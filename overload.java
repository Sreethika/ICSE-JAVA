import java.util.*;
public class overload
{
    public double area(double a, double b, double c)
    {
        double s,ar;
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return(ar);
    }
    public double area(int a, int b, int height)
    {
        double ar;
        ar=(height*(a+b))/2;
        return ar;
    }
    public double area(double diagonal1, double diagonal2)
    {
        double ar;
        ar=(diagonal1*diagonal2)/2;
        return(ar);
    }
}