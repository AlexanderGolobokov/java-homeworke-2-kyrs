package zadanie_10.prak_4_1;

public class Train extends Vehicle{
    private int countOfRailwayCarriage;
    private String CLASS;

    {
        countOfRailwayCarriage = 0;
        CLASS = "no class";
        price = 3;
    }

    Train(){}

    public Train(int countOfRailwayCarriage, String CLASS, String model) {
        super(model);
        this.countOfRailwayCarriage = countOfRailwayCarriage;
        this.CLASS = CLASS;
    }

    public int getCountOfRailwayCarriage() {
        return countOfRailwayCarriage;
    }

    public void setCountOfRailwayCarriage(int countOfRailwayCarriage) {
        this.countOfRailwayCarriage = countOfRailwayCarriage;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    @Override
    public double costRide(double metrs) {
        switch (CLASS){
            case "platc":
                return metrs / 1000 * (price - 1.5);
            case "standart":
                return metrs / 1000 * price;
            case "buisnes":
                return metrs / 1000 * (price * 2);
            default:
                return 0;
        }
    }

    @Override
    public boolean isTrunk() {
        return false;
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
    public boolean isRails() {
        return true;
    }

    @Override
    public boolean isGround() {
        return true;
    }
}
