public class RightTriangle extends Figure{
    double a,b,c;
    public RightTriangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        return a*b/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
