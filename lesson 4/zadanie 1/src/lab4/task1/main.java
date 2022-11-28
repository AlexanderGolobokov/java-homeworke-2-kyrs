package lab4.task1;

public class main {
    public  static  void  Case(Seasons seasons){
        switch (seasons){
            case winter -> System.out.println("Я люблю зиму");
            case autumn -> System.out.println("Я люблю осень");
            case spring -> System.out.println("Я люблю весну");
            case summers -> System.out.println("Я люблю лето");
        }
    }
    public static void main(String[] args) {
        Seasons seasons= Seasons.winter;
        System.out.println("я люблю "+seasons+"\n");
        Case(seasons);
        seasons.getDescription(seasons);
        for(int i=0;i<4;i++){
            if(Seasons.winter.ordinal()==i){
                System.out.println(Seasons.winter+"="+Seasons.winter.degree+" ");}
        else if(Seasons.autumn.ordinal()==i){
            System.out.println(Seasons.autumn+"="+Seasons.autumn.degree+" ");}
        else if(Seasons.summers.ordinal()==i){
                System.out.println(Seasons.summers+"="+Seasons.summers.degree+" ");}
            else if(Seasons.spring.ordinal()==i){
                System.out.println(Seasons.spring+"="+Seasons.spring.degree+" ");}
        }
    }

}
