package zadanie_10.prak_8;

public class reversal {
    public static void reversalNumber(int k){
        if (k % 10 == 0 && k / 10 == 0){
            return;
        }
        System.out.print(k % 10);
        reversalNumber(k /10);
    }

    public static int stepenOfNumber(int k){
        int count = 0;
        while (k / 10 != 0 || k % 10 != 0){
            count++;
            k /= 10;
        }
        return count;
    }

    public static int reversalNumberr(int k){
        if (k % 10 == 0 && k / 10 == 0){
            return 0;
        }
        return (int) Math.pow(10, stepenOfNumber(k)) * (k % 10) + reversalNumberr(k / 10);
    }

    public static void main(String[] args) {
        reversalNumber(103);
        System.out.println();
        System.out.println(reversalNumberr(1235454) / 10);
    }
}
