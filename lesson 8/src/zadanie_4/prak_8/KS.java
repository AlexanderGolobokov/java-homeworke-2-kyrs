package zadanie_4.prak_8;

public class KS {
    public static int getSum(int n){
        int sum = 0;
        while (n / 10 != 0 || n % 10 != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int K2S(int k, int s){
        int count = 0;
        for (int i = (int)Math.pow(10, k - 1); i <= (int)Math.pow(10, k) - 1; i++){
            if (getSum(i) == s){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(K2S(2, 5));
    }
}
