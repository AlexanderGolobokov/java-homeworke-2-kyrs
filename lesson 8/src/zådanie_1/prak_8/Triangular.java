package zådanie_1.prak_8;

public class Triangular {
    public static void TriangularSet(int k){
        if (k > 0) {
            TriangularSet(k - 1);
            for (int i = 0; i < k; i++) {
                System.out.println(k);
            }
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        TriangularSet(4);
    }
}
