package zadanie_2.prak_9;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int ID;
    private double mediumeMark;

    {
        name = "no name";
        ID = 0;
        mediumeMark = 0;
    }

    public Student2() {}

    public Student2(String name, int ID, double mediumeMark) {
        this.name = name;
        this.ID = ID;
        this.mediumeMark = mediumeMark;
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.mediumeMark - o.mediumeMark < 0){
            return -1;
        } else if (this.mediumeMark - o.mediumeMark > 0) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getMediumeMark() {
        return mediumeMark;
    }

    public void setMediumeMark(double mediumeMark) {
        this.mediumeMark = mediumeMark;
    }
}
