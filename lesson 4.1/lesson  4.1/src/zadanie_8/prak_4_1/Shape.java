package zadanie_8.prak_4_1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    {
        color = "no color";
        filled = false;
    }
    Shape(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();

    public abstract String getType();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
