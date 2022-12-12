package zadanie_9.prak_4_1;

public abstract class Furniture {
    protected double weigth;
    protected double volume;
    protected String name;
    {
        this.weigth = 0;
        this.volume = 0;
        this.name = "no name";
    }
    Furniture(){}
    Furniture(double weigth, double volume, String name){
        this.weigth = weigth;
        this.volume = volume;
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
