package FirstPart;

public class Parallelepiped extends GeometricBody {
    private double length,width,height;
    public Parallelepiped(double length,double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double getVolume() {
        return width * length * height;
    }
}
