package lab2.ex3;

public class Tester {
    //не предполагается создавать объекты этого класса, поэтому свойства статик
    public static int number = 5;
    public static Circle[] circles = new Circle[number];
    public static void main(String[] args) {
        //Заполнение массива объектами circle
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(new Point(),1);
        }
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
