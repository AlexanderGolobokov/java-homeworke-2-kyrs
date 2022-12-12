package zadanie_3.prak_9;

public class SortByMerger {

    public static void mergenSort(Student3[] array, int left, int right){
        int delimetr = left + ((right - left) / 2);
        if (delimetr > 0 && right > left + 1){
            mergenSort(array, left, delimetr - 1);
            mergenSort(array, delimetr, right);
        }
        Student3[] buffer = new Student3[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i ++){
            if (delimetr > right || array[cursor].getMediumMark() > array[delimetr].getMediumMark()){
                buffer[i] = array[cursor];
                cursor++;
            }else {
                buffer[i] = array[delimetr];
                delimetr++;
            }
        }
    }

    public static Student3[] sortByMerger(Student3[] array1, Student3[] array2){
        Student3[] array3 = new Student3[array1.length + array1.length];
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            array3[array1.length + i] = array2[i];
        }
        mergenSort(array3, 0, array3.length - 1);
        return array3;
    }

    public static void main(String[] args) {
        Student3[] array1 = {new Student3(3.4), new Student3(3), new Student3(5), new Student3(4.4)};
        Student3[] array2 = {new Student3(2), new Student3(5), new Student3(4.5)};
        Student3[] array = new Student3[array1.length + array2.length];
        array = sortByMerger(array1, array2);
        for (Student3 i : array){
            System.out.println(i.getMediumMark());
        }
    }
}
