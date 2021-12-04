package FirstPart;

public class Cube extends GeometricBody{
    private double vertexLength;
    public Cube(double vertexLength){
        this.vertexLength = vertexLength;
    }

    @Override
    public double getSurface() {
        return 6 * vertexLength * vertexLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(vertexLength,3);
    }
}
