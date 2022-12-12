package zadanie_5.prak_8;

public class Sum {

    public static int getSum(int n){
        int sum = 0;
        while (n / 10 != 0 || n % 10 != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int Sum(int N){
        if (N == 0){
            return 0;
        }else {
            return (N % 10) + Sum(N / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(Sum(123));
    }
}
