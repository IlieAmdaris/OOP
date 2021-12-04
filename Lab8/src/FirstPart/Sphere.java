package FirstPart;

public class Sphere extends GeometricBody {
    private double radius;
    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4.0/3.0 * Math.PI * Math.pow(radius,3);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius,2);
    }
}
