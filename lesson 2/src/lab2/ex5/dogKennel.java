package lab2.ex5;

public class dogKennel {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog("Шарик", 8), new Dog("Борик", 3)};

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
