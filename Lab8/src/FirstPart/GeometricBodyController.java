package FirstPart;

import java.util.List;

public class GeometricBodyController {
    public double getHighestVolume(List<GeometricBody> list){
        double max  = 0;
        for(GeometricBody body : list){
            max = Math.max(body.getVolume(), max);
        }
        return max;
    }
    public double getHighestSurfaceArea(List<GeometricBody> list){
        double max  = 0;
        for(GeometricBody body : list){
            max = Math.max(body.getSurface(), max);
        }
        return max;
    }
}
