package zadanie_1.prak_9;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private int ID;
    {
        firstName = "no name";
        lastName = "no name";
        ID = 0;
    }

    Student(){}

    Student(String firstName, String lastName, int ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    @Override
    public int compareTo(Student o) {
        return firstName.compareTo(o.getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
