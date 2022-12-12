package zadanie_2.prak_9;


import java.util.Map;

public class QuickSortingByMarks {
    public static void fastSort(Student2[] student2s, int low, int hight){
        if (student2s.length == 0 || hight <= low ){
            return;
        }
        int middle = low + (hight - low) / 2;
        Student2 opora = student2s[middle];

        int i = low, j = hight;
        while (i <= j){
            while (student2s[i].getMediumeMark() < opora.getMediumeMark() && i < student2s.length){
                i++;
            }

            while (student2s[i].getMediumeMark() > opora.getMediumeMark() && j > 0){
                j--;
            }

            if (i <= j){
                Student2 temp = student2s[i];
                student2s[i] = student2s[j];
                student2s[j] = temp;
                i++;
                j--;
            }
        }
        if (low > j){
            fastSort(student2s, low, j);
        }
        if (hight < i){
            fastSort(student2s, i, hight);
        }

    }

    public static void main(String[] args) {
        Student2[] students = new Student2[5];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student2();
            students[i].setMediumeMark(Math.random() * 5);
            System.out.print(students[i].getMediumeMark() + "\t");
        }
        System.out.println("\n");
        fastSort(students, 0, students.length - 1);
        for (Student2 i : students){
            System.out.print(i.getMediumeMark() + "\t");
        }
        System.out.println();
    }
}
