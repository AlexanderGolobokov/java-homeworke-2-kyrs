package zadanie_10.prak_4_1;

public class Car extends Vehicle{
    private int countOfDoors;
    private double maxPower;
    private double nMetr;
    {
        countOfDoors = 0;
        maxPower = 0;
        nMetr = 0;
        this.price = 1;
    }
    public Car(){
        super();
    }

    public Car(double price, String model, int countOfDoors, double maxPower, double nMetr) {
        super(model);
        this.countOfDoors = countOfDoors;
        this.maxPower = maxPower;
        this.nMetr = nMetr;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getnMetr() {
        return nMetr;
    }

    public void setnMetr(double nMetr) {
        this.nMetr = nMetr;
    }

    @Override
    public double costRide(double metrs){
        return metrs / 1000 * price;
    }

    @Override
    public boolean isTrunk() {
        return true;
    }

    @Override
    public boolean isAir() {
        return false;
    }

    @Override
    public boolean isWater() {
        return false;
    }

    @Override
    public boolean isGround() {
        return true;
    }

    @Override
    public boolean isRails() {
        return false;
    }
}
