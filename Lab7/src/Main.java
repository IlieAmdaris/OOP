import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FigureController figureController = new FigureController(new ArrayList<>(){{
            add(new Square(3));
            add(new Rectangle(3,4));
            add(new RightTriangle(3,4,5));
        }});
        System.out.println("Highest Area: " + figureController.highestArea() + "\nHighest Perimeter: " + figureController.highestPerimeter());
        Figure Circle = new Figure(){
            double radius = 10;
            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }
        };
        System.out.println("Area of the circle: " + Circle.getArea() + "\nPerimeter of the circle: " + Circle.getPerimeter());
        figureController.addFigure(Circle);
        System.out.println("Highest Area: " + figureController.highestArea() + "\nHighest Perimeter: " + figureController.highestPerimeter());
    }
}
