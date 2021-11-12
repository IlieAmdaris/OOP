package Task3;

public class B extends A
{
    protected String b;

    public B(String all)
    {
        super(all, new X(all));
        this.b = all;
    }

    public B(String a, String b)
    {
        super(a, new X("x"));
        this.b = b;
    }

    @Override
    public String toString()
    {
        return "B{" +
                "b='" + b + '\'' +
                "} " + super.toString();
    }
}
