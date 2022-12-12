package zadanie_9.prak_4_1;

public class Table extends Furniture{
    private int countOflegs;
    private String material;
    {
        this.countOflegs = 0;
        this.material = "no material";
        this.weigth = 0;
        this.volume = 0;
    }
    Table(){}
    Table(double weight, double volume, int countOflegs, String material, String name){
        super(weight, volume, name);
        this.countOflegs = countOflegs;
        this.material = material;
    }

    public int getCountOflegs() {
        return countOflegs;
    }

    public void setCountOflegs(int countOflegs) {
        this.countOflegs = countOflegs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
