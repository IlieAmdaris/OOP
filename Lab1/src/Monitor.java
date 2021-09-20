public class Monitor {
    private String color;
    private int width,height;
    private String resolution;


    public Monitor(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.resolution = width +"x"+height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getResolution() {
        return width +"x"+height;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
        width = Integer.parseInt(resolution.substring(0,this.resolution.lastIndexOf('x')));
        height = Integer.parseInt(resolution.substring(this.resolution.lastIndexOf('x')+1));

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        resolution = resolution.replace(String.valueOf(this.width),String.valueOf(width));
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        resolution = resolution.replace(String.valueOf(this.height),String.valueOf(height));
        this.height = height;
    }
}
