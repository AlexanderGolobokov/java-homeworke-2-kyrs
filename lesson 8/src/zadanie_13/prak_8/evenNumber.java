package zadanie_13.prak_8;

public class evenNumber {
    public static String[] decreaseArray(String[] array, int index){
        String[] array2 = new String[array.length - index];
        for (int i = 0; i  < array2.length; i++){
            array2[i] = array[i + index];
        }
        return array2;
    }

    public static boolean isDight(String array){
        char[] charArray = array.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (!Character.isDigit(charArray[i])){
                return false;
            }
        }
        return true;
    }

    public static int strint2int(String str){
        char[] charsArr = str.toCharArray();
        int k = 0;
        int res = 0;
        for (int i = charsArr.length - 1; i >= 0; i--){
            res += Character.getNumericValue(charsArr[i]) * (int) Math.pow(10, k);
            k++;
        }
        return res;
    }



    public static void evenNumbers(String[] array, int k){
        if (array.length != 0){
            if (isDight(array[0])){
                if (k % 2 == 0){
                    System.out.println(array[0]);
                }
                evenNumbers(decreaseArray(array, 1), k + 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"0", "1", "2", "3", "4"};
//        String[] arr2 = decreaseArray(arr, 1);
//        for (String i : arr2){
//            System.out.println(i);
//        }
//        System.out.println(strint2int("234"));
        evenNumbers(arr, 0);
    }

}
