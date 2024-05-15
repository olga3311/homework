package lesson27.Fence;

public class Rectangle  extends  Shape{
    private double length;
    public double width;

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( width + length);
    }
}
