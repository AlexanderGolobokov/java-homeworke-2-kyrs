package zadanie_1.prak_9;


public class SortingByInsert {

    public static void sortInsert(Student[] students){
        int j;
        for(int i = 1; i < students.length; i++){
            Student swap = students[i];
            for(j = i; j > 0 && swap.getID() < students[j - 1].getID(); j--){
                students[j] = students[j - 1];
            }
            students[j] = swap;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student();
        }
        students[0].setFirstName("Sam");
        students[0].setLastName("Miller");
        students[0].setID(123);

        students[1].setFirstName("Tomi");
        students[1].setLastName("Vaiso");
        students[1].setID(1233);

        students[2].setFirstName("Lars");
        students[2].setLastName("Trier");
        students[2].setID(23);

        students[3].setFirstName("Night");
        students[3].setLastName("Shuler");
        students[3].setID(111);

        sortInsert(students);

        for (Student i : students){
            System.out.println(i.getFirstName() + "\n" + i.getLastName() + "\n" + i.getID());
            System.out.println("\n");
        }
    }
}
