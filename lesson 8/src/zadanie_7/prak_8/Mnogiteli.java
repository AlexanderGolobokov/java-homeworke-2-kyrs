package zadanie_7.prak_8;

public class Mnogiteli {
    public static void Mnogitell(int num, int k){
        if(k == 1){
            System.out.println(k);
            return;
        }else {
            Mnogitell(num, k - 1);
            if (num  % k == 0){
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        Mnogitell(30, 30);
    }
}
