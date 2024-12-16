public class joystring
{
    public void joystring(String s, char ch1, char ch2) 
    {
        String newStr = s.replace(ch1, ch2);
        System.out.println(newStr);
    }
    public void joystring(String s) 
    {
        int f = s.indexOf(' ');
        int l = s.lastIndexOf(' ');
        System.out.println("First index:  " + f);
        System.out.println("Last index:  " + l);
    } 
    public void joystring(String s1, String s2) 
    {
        String newStr = s1.concat(" ").concat(s2);
        System.out.println(newStr);
    }
    public static void main(String args[])
    {
        joystring obj = new joystring();
        obj.joystring("TECHNALAGY", 'A', 'O');
        obj.joystring("Cloud computing means Internet based computing");
        obj.joystring("COMMON WEALTH", "GAMES");
    }
}