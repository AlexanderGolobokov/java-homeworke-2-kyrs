package zadanie_9.prak_4_1;

public class Shelf extends Furniture{
    private double maxWeigth;
    private String material;
    {
        this.material = "no material";
        this.maxWeigth = 0;
        this.weigth = 0;
        this.volume = 0;
    }
    public Shelf() {}

    public Shelf(double weigth, double volume, double maxWeigth, String material, String name) {
        super(weigth, volume, name);
        this.maxWeigth = maxWeigth;
        this.material = material;
    }

    public double getMaxWeigth() {
        return maxWeigth;
    }

    public void setMaxWeigth(double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
