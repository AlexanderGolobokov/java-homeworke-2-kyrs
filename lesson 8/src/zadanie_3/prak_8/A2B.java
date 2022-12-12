package zadanie_3.prak_8;

public class A2B {
    public static void A2B(int a, int b){
        if (a == b){
            System.out.println(a);
            return;
        } else if (a < b) {
            A2B(a, b -1);
            System.out.println(b);
        }else {
            A2B(b, a -1);
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        A2B(2 ,9);
    }
}
