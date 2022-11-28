package lab4.task3;

enum computers{


    Lenovo(35000),
    Acer(45000),
    Macbook(120000);

    private double cost;

    computers(double cost){
        this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}