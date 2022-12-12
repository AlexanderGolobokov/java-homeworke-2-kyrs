package zadanie_4.prak_8;

public class KSrec {
    public static int getSum(int n){
        int sum = 0;
        while (n / 10 != 0 || n % 10 != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int KtwoS(int num, int s, int k){
        if (num >= (int)Math.pow(10, k)){
            return 0;
        }
        if (getSum(num) == s){
            return 1 + KtwoS(num + 1, s, k);
        }else {
            return KtwoS(num + 1, s, k);
        }
    }

    public static void main(String[] args) {
        System.out.println(KtwoS(10, 3, 2));
    }
}
