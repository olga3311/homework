package lesson25.example2;

public class Circle1 implements Shape{
    private double r;

    public Circle1(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(r,2);
    }
}
