package Task2;

public class H extends G
{
    protected String h;

    public H(String all)
    {
        super(all);
        this.h = all;
    }

    public H(String a, String b, String c, String d, String e, String f, String g, String h)
    {
        super(a, b, c, d, e, f, g);
        this.h = h;
    }

    @Override
    public String toString()
    {
        return "H{" +
                "h='" + h + '\'' +
                "} " + super.toString();
    }
}
