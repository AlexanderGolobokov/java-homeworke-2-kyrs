package zadanie_14.prak_8;

public class NumbersLeftToRight {
    public static void left2Rigth(int num){
        if (num != 0){
            left2Rigth(num / 10);
            System.out.print(num % 10 + " ");
        }
    }


    public static void main(String[] args) {
        left2Rigth(12345);
    }

}
