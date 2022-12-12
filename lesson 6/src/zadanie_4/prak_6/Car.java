package zadanie_4.prak_6;

public class Car implements Priceable{
    private double price;
    private double maxPower;

    public Car() {
        price = 0;
        maxPower = 0;
    }

    public Car(double price, double maxPower) {
        this.price = price;
        this.maxPower = maxPower;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
