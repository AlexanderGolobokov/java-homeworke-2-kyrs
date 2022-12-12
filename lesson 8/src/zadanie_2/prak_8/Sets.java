package zadanie_2.prak_8;

public class Sets {
    public static void Sets(int k) {
        if (k == 1) {
            System.out.println(k);
        } else {
            Sets(k - 1);
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        Sets(5);
    }
}
