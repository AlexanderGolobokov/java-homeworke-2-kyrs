package zadanie_10.prak_4_1;

public class Ship extends Vehicle{
    private int apacity;
    private double powerReserve;
    {
        apacity = 0;
        powerReserve = 0;
        price = 2;
    }
    public Ship(){
        super();
    }

    public Ship(String model, int apacity, double powerReserve) {
        super(model);
        this.apacity = apacity;
        this.powerReserve = powerReserve;
    }

    public int getApacity() {
        return apacity;
    }

    public void setApacity(int apacity) {
        this.apacity = apacity;
    }

    public double getPowerReserve() {
        return powerReserve;
    }

    public void setPowerReserve(double powerReserve) {
        this.powerReserve = powerReserve;
    }

    @Override
    public double costRide(double metrs) {
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
        return true;
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
