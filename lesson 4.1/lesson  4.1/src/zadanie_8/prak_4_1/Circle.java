package zadanie_8.prak_4_1;

public class Circle extends Shape {
    protected double x;
    protected double y;
    protected double r;

    {
        this.x = 0;
        this.y = 0;
        this.r = 0;
        this.color = "no color";
        this.filled = false;
    }
    Circle(){}
    Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r =r;
    }
    Circle(double x, double y, double r, String color, boolean filled){
        new Circle(x, y, r);
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", color='" + super.color + '\'' +
                ", filled=" + super.filled +
                '}';
    }
}
