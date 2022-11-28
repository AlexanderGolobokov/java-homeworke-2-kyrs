package lab4.task1;

public enum Seasons {
    summers(25),
    spring(10),
    winter(-25),
    autumn(15);
    double degree;
    Seasons(double degree) {
        this.degree=degree;
    }

    public void getDescription(Seasons seasons){
        if(seasons==Seasons.summers){System.out.println("Теплое время года");}
        else {System.out.println("Холодное время года");}
    }
}
