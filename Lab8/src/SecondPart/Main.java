package SecondPart;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        IGeometricBody[] geometricBodies = {new Cube(5), new Sphere(4),new Parallelepiped(5, 4,3) };
        GeometricBodyController geometricBodyController = new GeometricBodyController();
        System.out.println(geometricBodyController.getHighestSurfaceArea(Arrays.asList(geometricBodies)));
        System.out.println(geometricBodyController.getHighestVolume(Arrays.asList(geometricBodies)));
    }
}
