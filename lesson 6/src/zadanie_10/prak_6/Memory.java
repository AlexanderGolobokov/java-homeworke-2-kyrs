package zadanie_10.prak_6;

public class Memory {
    private double size;
    private String type;

    public Memory() {
        this.size = 0;
        this.type = "no type";
    }

    public Memory(double size, String type) {
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
