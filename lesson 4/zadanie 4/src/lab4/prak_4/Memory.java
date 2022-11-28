package lab4.prak_4;

public class Memory {
    private String type;
    private int GB;
    {
        this.type = "no type";
        this.GB = 0;
    }
    Memory(){}

    public Memory(String type, int GB) {
        this.type = type;
        this.GB = GB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }
}
