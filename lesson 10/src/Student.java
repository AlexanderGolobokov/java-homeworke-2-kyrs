import java.util.Comparator;
public class Student implements Comparable<Double>{
    private String name;
    private double mediumMark;
    private int ID;
    {
        this.name = "no name";
        this.mediumMark = 0;
        this.ID = 0;
    }

    public Student() {}

    public Student(double mediumMark) {
        this.mediumMark = mediumMark;
    }

    public Student(String name, double mediumMark, int ID) {
        this.name = name;
        this.mediumMark = mediumMark;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMediumMark() {
        return mediumMark;
    }

    public void setMediumMark(double mediumMark) {
        this.mediumMark = mediumMark;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(Double o) {
        if (this.getMediumMark() > o){
            return 1;
        } else if (this.getMediumMark() < o) {
            return -1;
        }else {
            return 0;
        }
    }

}
