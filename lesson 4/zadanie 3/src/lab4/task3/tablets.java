package lab4.task3;

enum tablets{
    samsung(32000),
    lenovo(20000),
    ipad(35000);

    private double cost;

    tablets(double cost){
        this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}