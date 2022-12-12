package zadanie_10.prak_4_1;

public abstract class Vehicle {
    protected double price;
    protected String model;
    {
        this.model = "no model";
    }
    public Vehicle(){}

    public Vehicle(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract boolean isTrunk();
    public abstract boolean isAir();
    public abstract boolean isWater();
    public abstract boolean isGround();
    public abstract boolean isRails();
    public abstract double costRide(double metrs);
}
