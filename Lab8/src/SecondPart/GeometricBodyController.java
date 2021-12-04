package SecondPart;

import java.util.List;

public class GeometricBodyController {
    public double getHighestVolume(List<IGeometricBody> list){
        double max  = 0;
        for(IGeometricBody body : list){
            max = Math.max(body.getVolume(), max);
        }
        return max;
    }
    public double getHighestSurfaceArea(List<IGeometricBody> list){
        double max  = 0;
        for(IGeometricBody body : list){
            max = Math.max(body.getSurface(), max);
        }
        return max;
    }
}
