import java.util.ArrayList;

public class FigureController {
    private ArrayList<Figure> figures;
    public FigureController(ArrayList<Figure> figures){
        this.figures = figures;
    }
    public void addFigure(Figure figure){
        figures.add(figure);
    }
    public double highestArea(){
        double max = 0;
        for (Figure figure : figures){
            double area = figure.getArea();
            if (area > max){
                max = area;
            }
        }
        return max;
    }
    public double highestPerimeter(){
        double max = 0;
        for (Figure figure : figures){
            double perimeter = figure.getPerimeter();
            if (perimeter > max){
                max = perimeter;
            }
        }
        return max;
    }
}
