package lab2.ex4;

public class PC {
    private String model;
    private String color;
    private String cpu;
    private String ram;

    public PC(String model, String color, String cpu, String ram) {
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
