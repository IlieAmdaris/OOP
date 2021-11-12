package Task2;

public class E extends D
{
    protected  String e;

    public E(String all)
    {
        super(all);
        this.e = all;
    }

    public E(String a, String b, String c, String d, String e)
    {
        super(a, b, c, d);
        this.e = e;
    }

    @Override
    public String toString()
    {
        return "E{" +
                "e='" + e + '\'' +
                "} " + super.toString();
    }
}
