package zadanie_17.prak_8;

public class MaxOfSet {

    public static int[] decreaseArray(int[] array, int index){
        int[] arr = new int[array.length - index];
        for (int i = 0; i < arr.length; i++){
            arr[i] = array[i + index];
        }
        return arr;
    }

    public static int MaxNumber(int[] array){
        if (array[0] != 0 && array.length > 1){
            if(array[0] > MaxNumber(decreaseArray(array, 1))){
                return array[0];
            }else {
                return MaxNumber(decreaseArray(array, 1));
            }
        }else {
            if (array.length == 1){
                return array[0];
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] arr = { 18, 10, 22, 234, 0};
        System.out.println(MaxNumber(arr));
    }


}
