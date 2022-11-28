package lab4.task3;

enum allShop{
    computers(1),
    phones(2),
    tablets(3);
    private int number;

    allShop(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
}