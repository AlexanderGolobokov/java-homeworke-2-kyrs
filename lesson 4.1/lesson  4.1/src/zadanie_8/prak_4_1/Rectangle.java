package zadanie_8.prak_4_1;

public class Rectangle extends Shape{
    protected double length;
    protected double width;

    Rectangle(){
        length = 0;
        width = 0;
        super.filled = false;
    }
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    Rectangle(double length, double width, String color, boolean filled){
        new Rectangle(length, width);
        super.color = color;
        super.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimetr() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + super.color + '\'' +
                ", filled=" + super.filled +
                '}';
    }
}
