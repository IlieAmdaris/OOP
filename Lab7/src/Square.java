public class Square extends Figure {
    private double verticeLength;
    public Square(double verticeLength){
        this.verticeLength = verticeLength;
    }
    @Override
    public double getArea() {
        return verticeLength * verticeLength;
    }

    @Override
    public double getPerimeter() {
        return verticeLength * 4;
    }
}
