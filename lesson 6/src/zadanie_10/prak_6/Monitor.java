package zadanie_10.prak_6;

public class Monitor {
    private double length;
    private String quality;

    public Monitor() {
        this.length = 0;
        this.quality = "no quality";
    }

    public Monitor(double length, String quality) {
        this.length = length;
        this.quality = quality;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
