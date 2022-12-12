package zadanie_12.prak_8;

public class oddNumbers {
    public static int oddCount(String arr){
        if (!arr.isEmpty()) {
            if (Character.isDigit(arr.charAt(0))) {
                if (Character.getNumericValue(arr.charAt(0)) % 2 == 0) {
                    return 1 + oddCount(arr.substring(1));
                } else {
                    return oddCount(arr.substring(1));
                }
            }else {
                return oddCount(arr.substring(1));
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(oddCount("12345678"));
    }
}
