package zadanie_9.prak_4_1;

public class Chair extends Furniture{
    private int countOfLegs;
    private String material;
    {
        this.countOfLegs = 0;
        this.material = "no material";
        this.volume = 0;
        this.weigth = 0;
    }
    public Chair(){}

    public Chair(double weigth, double volume, int countOfLegs, String material, String name) {
        super(weigth, volume, name);
        this.countOfLegs = countOfLegs;
        this.material = material;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
