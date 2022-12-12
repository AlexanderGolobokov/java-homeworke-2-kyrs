package zadanie_11.prak_8;

public class CountOfOnes {
    public static int countOfOnes(String array){
        if (!array.isEmpty()) {
            if (Character.isDigit(array.charAt(0))) {
                if (Character.getNumericValue(array.charAt(0)) == 1) {
                    return 1 + countOfOnes(array.substring(1));
                } else {
                    return countOfOnes(array.substring(1));
                }
            }
            else{
                return 0;
            }
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(countOfOnes("12372211"));
    }
}
