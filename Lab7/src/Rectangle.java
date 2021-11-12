public class Rectangle extends Figure{
    private double length,height;
    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }
}
