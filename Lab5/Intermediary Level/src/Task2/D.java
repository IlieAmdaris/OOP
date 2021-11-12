package Task2;

public class D extends C
{
    protected  String d;

    public D(String all)
    {
        super(all);
        this.d=all;
    }

    public D(String a, String b, String c, String d)
    {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String toString()
    {
        return "D{" +
                "D='" + d + '\'' +
                "} " + super.toString();
    }
}
