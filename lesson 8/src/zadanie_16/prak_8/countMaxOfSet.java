package zadanie_16.prak_8;



//TODO: isn't ready

public class countMaxOfSet {
    public static int[] decreaseArray(int[] array, int index){
        int[] arr = new int[array.length - index];
        for (int i = 0; i < arr.length; i++){
            arr[i] = array[i + index];
        }
        return arr;
    }

    public static int countMaxNumber(int[] array){
        if (array[0] != 0 && array.length > 1){
            if(array[0] > countMaxNumber(decreaseArray(array, 1))){
                return array[0];
            }else {
                return countMaxNumber(decreaseArray(array, 1));
            }
        }else {
            if (array.length == 1){
                return array[0];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 18, 234, 5, 234, 10, 234, 0};
        System.out.println(countMaxNumber(arr));
    }
}
