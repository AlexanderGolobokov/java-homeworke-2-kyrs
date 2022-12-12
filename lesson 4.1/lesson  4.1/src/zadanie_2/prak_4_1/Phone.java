package zadanie_2.prak_4_1;

public class Phone {
    private String model;
    private String number;
    private double weigth;

    {
        this.model = "no model";
        this.number = "no number";
        this.weigth = 0;
    }
    Phone(){}
    Phone(String model, String number){
        this.model = number;
        this.number = number;
    }
    public Phone(String model, String number, double weigth){
        new Phone(model, number);
        this.weigth = weigth;
    }
    public void receiveCall(String name){
        System.out.println("Calling " + name + "...");
    }

    public void receiveCall(String name, String number){
        System.out.println("Calling " + name + " to " + number + "...");
    }

    public String getNumber() {
        return number;
    }

}
