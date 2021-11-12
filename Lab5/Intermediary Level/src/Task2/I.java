package Task2;

public class I extends H
{
    protected String i;

    public I(String all)
    {
        super(all);
        this.i = all;
    }

    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i)
    {
        super(a, b, c, d, e, f, g, h);
        this.i = i;
    }

    @Override
    public String toString()
    {
        return "I{" +
                "i='" + i + '\'' +
                "} " + super.toString();
    }
}
