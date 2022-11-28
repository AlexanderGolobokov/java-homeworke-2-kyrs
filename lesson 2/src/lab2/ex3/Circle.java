package lab2.ex3;

public class Circle {
    private final double r;
    private final Point point;
    public Circle(Point point ,double r){
        this.point = point;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public Point getPoint() {
        return point;
    }
}
