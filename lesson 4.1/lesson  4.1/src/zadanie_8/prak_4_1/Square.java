package zadanie_8.prak_4_1;

public class Square extends Rectangle{
    private double side;

    Square(){
        super();
        this.side = 0;
    }
    Square(double side){
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }
}
