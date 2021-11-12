package Task2;

public class G extends F
{
    protected  String g;

    public G(String all)
    {
        super(all);
        this.g = all;
    }

    public G(String a, String b, String c, String d, String e, String f, String g)
    {
        super(a, b, c, d, e, f);
        this.g = g;
    }

    @Override
    public String toString()
    {
        return "G{" +
                "g='" + g + '\'' +
                "} " + super.toString();
    }
}
