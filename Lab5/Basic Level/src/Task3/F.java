package Task3;

public class F extends E
{
    protected String f;

    public F(String all)
    {
        super(all);
        this.f = all;
    }

    public F(String a, String b, String c, String d, String e, String f)
    {
        super(a, b, c, d, e);
        this.f = f;
    }

    @Override
    public String toString()
    {
        return "F{" +
                "f='" + f + '\'' +
                "} " + super.toString();
    }
}
