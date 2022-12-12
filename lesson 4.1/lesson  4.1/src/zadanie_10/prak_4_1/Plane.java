package zadanie_10.prak_4_1;

public class Plane extends Vehicle{
    private int countOfEngine;
    private int capacity;
    private String CLASS;
    {
        CLASS = "no class";
        countOfEngine = 0;
        capacity = 0;
        price = 4;
    }

    public Plane(){
        super();
    }

    public Plane(String model, int countOfEngine, int capacity, String CLASS) {
        super(model);
        this.countOfEngine = countOfEngine;
        this.capacity = capacity;
        this.CLASS = CLASS;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public int getCountOfEngine() {
        return countOfEngine;
    }

    public void setCountOfEngine(int countOfEngine) {
        this.countOfEngine = countOfEngine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double costRide(double metrs) {
        switch (CLASS){
            case "economy":
                return metrs / 1000 * (price - 1.5);
            case "standart":
                return metrs / 1000 * price;
            case "buisness":
                return metrs / 1000 * (price * 3);
            default:
                return 0;
        }
    }

    @Override
    public boolean isTrunk() {
        return true;
    }

    @Override
    public boolean isAir() {
        return true;
    }

    @Override
    public boolean isWater() {
        return false;
    }

    @Override
    public boolean isGround() {
        return false;
    }

    @Override
    public boolean isRails() {
        return false;
    }
}
