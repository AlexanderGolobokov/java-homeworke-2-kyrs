import java.util.ArrayList;
import java.util.Comparator;

public class SortStudentsByGPA implements Comparator<Student> {
    private Student[] students;

    public void setArray(int n){
        students = new Student[n];
        for (int i = 0; i < n; i++){
            students[i] = new Student((int)(Math.random() * 5));
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMediumMark().compareTo(o2.getMediumMark());
    }

    public static void quickSort(Student[] students, int low, int hight){
        if (students.length == 0){
            return;
        }
        if (low >= hight){
            return;
        }
        int midle = low + (hight - low) / 2;
        Student opora = students[midle];

        int i = low, j = hight;
        while (i <= j){
            while (students[i].getMediumMark().compareTo(opora.getMediumMark()) == -1){
                i++;
            }
            while (students[i].getMediumMark().compareTo(opora.getMediumMark()) == 1){
                j--;
            }
            if (i <= j){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j){
            quickSort(students, low, j);
        }
        if (hight > i){
            quickSort(students, i, hight);
        }
        System.out.println(1);
    }

    public Student[] uniteArrays(Student[] students1, Student[] students2){
        Student[] array = new Student[students1.length + students2.length];
        for (int i = 0; i < students1.length; i++){
            array[i] = students1[i];
        }
        for (int i = 0; i < students2.length; i++){
            array[i + students1.length] = students2[i];
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void outArray() {
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getMediumMark() + ", ");
        }
    }


    public static void main(String[] args) {
        SortStudentsByGPA sortStudentsByGPA = new SortStudentsByGPA();
        sortStudentsByGPA.setArray(4);
        sortStudentsByGPA.outArray();
        quickSort(sortStudentsByGPA.students, 0, sortStudentsByGPA.students.length - 1);
        sortStudentsByGPA.outArray();
    }
}
