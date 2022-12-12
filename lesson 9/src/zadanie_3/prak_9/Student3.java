package zadanie_3.prak_9;

public class Student3 implements Comparable<Student3>{
    private String name;
    private int ID;
    private double mediumMark;

    {
        this.ID = 0;
        this.name = "no name";
        this.mediumMark = 0;
    }

    public Student3() {}

    public Student3(double mediumMark){
        this.mediumMark = mediumMark;
    }

    public Student3(String name, int ID, double mediumMark) {
        this.name = name;
        this.ID = ID;
        this.mediumMark = mediumMark;
    }

    @Override
    public int compareTo(Student3 o) {
        if (this.mediumMark > o.getMediumMark()){
            return 1;
        }else {
            if (this.mediumMark < o.getMediumMark()){
                return -1;
            }
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

    public double getMediumMark() {
        return mediumMark;
    }

    public void setMediumMark(double mediumMark) {
        this.mediumMark = mediumMark;
    }
}
