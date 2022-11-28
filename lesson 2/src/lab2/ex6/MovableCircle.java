package lab2.ex6;


public class MovableCircle {
    int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center.x = x;
        this.center.y = y;
        this.center.ySpeed = ySpeed;
        this.center.xSpeed = xSpeed;
        this.radius = radius;
    }

    public String toString() {
        return "Movable: MovableCircle, x: " + this.center.x + ", y: " + this.center.y + ", ySpeed: " + this.center.ySpeed + ", xSpeed: " + this.center.xSpeed + ", radius: " + this.radius;
    }

    public void moveUp() {
    }

    public void moveDown() {
    }

    public void moveLeft() {
    }

    public void moveRight() {
    }
}
