package zadanie_9.prak_8;

import java.util.ArrayList;

public class Zeros {
    public static boolean isNorm(int k, int a, int b){
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        int countOne = 0;
        while (k % 10 != 0 || k / 10 != 0) {
            if (k % 10 == 0 || k % 10 == 1) {
                if (k % 10 == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            }
            list.add(k % 10);
            k /= 10;
        }
        if(countZero == a && countOne == b){
            for (int i = 1; i < list.size(); i++){
                if (list.get(i) == list.get(i - 1) && list.get(i) == 0){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    public static boolean isMore(int num, int a, int b){
        int countZero = 0;
        int countOne = 0;
        while (num % 10 != 0 || num / 10 != 0) {
            if (num % 10 == 0 || num % 10 == 1) {
                if (num % 10 == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            }
            num /= 10;
        }
        if (countZero > a && countOne > b){
            return false;
        }
        return true;
    }

    public static int binareNumber(int num){
        int result = 0;
        int i = 0;
        while (num / 10 != 0 || num % 10 != 0){
            result += (num % 2) * (int)Math.pow(10, i);
            num /= 2;
            i++;
        }
        return result;
    }

    public static int howNumbers(int a, int b, int i){
        if (isMore(binareNumber(i), a, b)){
            if (isNorm(binareNumber(i), a, b)){
                return 1 + howNumbers(a, b, i + 1);
            }else {
                return howNumbers(a, b, i + 1);
            }
        }else {
            if (isMore(i + 1, a, b)){
                return 0;
            }
            return howNumbers(a, b, i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(binareNumber(6));
        System.out.println(howNumbers(1,3, 0));
    }
}
