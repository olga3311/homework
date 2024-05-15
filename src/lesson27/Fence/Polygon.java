package lesson27.Fence;

public class Polygon extends Shape {
    private double sideLength;
    private double sideAmount;

    public Polygon(double sideLength, double sideAmount) {
        this.sideLength = sideLength;
        this.sideAmount = sideAmount;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getSideAmount() {
        return sideAmount;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideAmount(double sideAmount) {
        this.sideAmount = sideAmount;
    }

    @Override
    public double getPerimeter() {
        return sideAmount * sideLength;
    }
}
