class fisherpricetoys
{
    String name, colour;
    double cost;
    int year;
    fisherpricetoys(String n, String c, double co, int yr)
    {
        name=n;
        colour=c;
        cost=co;
        year=yr;
    }
    void display()
    {
        System.out.println(name+"\t"+colour+"\t\t"+cost+"\t"+year);
    }
    void display2()
    {
        System.out.println(name+"\t"+colour+"\t"+cost+"\t"+year);
    }
    public static void main(String args[])
    {
        fisherpricetoys scoobydog=new fisherpricetoys("scoobydog", "white", 450.00, 2007);
        fisherpricetoys minirobot=new fisherpricetoys("minirobot", "grey", 890.75, 2008);
        fisherpricetoys jetplane=new fisherpricetoys("jetplane", "red n white", 320.00, 2008);
        fisherpricetoys doctorkit=new fisherpricetoys("doctorkit", "red", 275.00, 2008);
        scoobydog.display();
        minirobot.display();
        jetplane.display2();
        doctorkit.display();
    }
}