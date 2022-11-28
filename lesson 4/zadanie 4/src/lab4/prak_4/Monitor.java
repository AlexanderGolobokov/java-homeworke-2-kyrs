package lab4.prak_4;

public class Monitor {
    private String type;
    private double diagonal;
    private int Hz;
    {
        this.type = "no type";
        this.diagonal = 0;
        this.Hz = 0;
    }
    Monitor(){}
    public Monitor(String type, double diagonal, int hz) {
        this.type = type;
        this.diagonal = diagonal;
        Hz = hz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getHz() {
        return Hz;
    }

    public void setHz(int hz) {
        Hz = hz;
    }
}
