public class Box {
    private double height,width,depth;
//isn't height the same as depth ?length would make more sense
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public Box() {
        this(1);
    }
    public Box(double value){
        this(value,value,value);
    }
    public Box(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double getVolume(){
        return width*height*depth;
    }
    public double getArea(){
        return 2 * ((depth * width)+  (depth * height) +  (width * height));
    }

}
