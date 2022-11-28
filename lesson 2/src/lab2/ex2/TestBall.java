package lab2.ex2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println("Начальные координаты: " + ball);
        System.out.println("-------------------------------");
        double step = 1d;  // Задаем шаг
        while (ball.getX() < 10 && ball.getY() < 10) {
            ball.move(ball.getX() + step, ball.getY() + step);
            System.out.println(ball);
        }
    }
}