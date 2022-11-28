package lab4.task3;

enum phones{
    Xiaomi(15000),
    Samsung(20000),
    iphone(40000);

    private double cost;

    phones(double cost){
        this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}