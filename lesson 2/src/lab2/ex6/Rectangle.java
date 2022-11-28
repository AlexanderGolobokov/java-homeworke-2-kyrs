package lab2.ex6;

public class Rectangle extends Shape {
    double width;
    double length;

    Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0 * this.width + 2.0 * this.length;
    }

    public String toString() {
        return "Shape: Rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
