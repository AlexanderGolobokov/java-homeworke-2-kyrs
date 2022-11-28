package lab2.ex6;

public class MovablePoint {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public String toString() {
        return "Movable: MovablePoint, x: " + this.x + ", y: " + this.y + ", ySpeed: " + this.ySpeed + ", xSpeed: " + this.xSpeed;
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
