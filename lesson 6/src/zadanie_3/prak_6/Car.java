package zadanie_3.prak_6;

public class Car implements Nameable{
    private String name;
    private double HoursePower;
    private double maxSpeed;
    {
        name = "no name";
        HoursePower = 0;
        maxSpeed = 0;
    }

    public Car() {}

    public Car(String name, double hoursePower, double maxSpeed) {
//        this.name = name;
        HoursePower = hoursePower;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursePower() {
        return HoursePower;
    }

    public void setHoursePower(double hoursePower) {
        HoursePower = hoursePower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
