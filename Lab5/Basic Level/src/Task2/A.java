package Task2;

public class A
{
    protected String a;
    protected X x;

    public A(String a, X x)
    {
        this.a = a;this.x = x;
    }

    @Override
    public String toString()
    {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
