package lab4.task1;

public enum Seazon {
    WINTER("Winter", "1st of december", "28th of 29th of february", -25.3),
    SPRING("Spring", "1st of marth", "31th of may", 10),
    SUMMER("Summer", "1st of june", "31th of august", 28),
    AUTUMN("Autumn", "1st of september", "31 of november", 7);
    final private String title;
    final static public String tittleWinter = "Winter";
    final static public String tittleSpring = "Spring";
    final static public String tittleSummer = "Summer";
    final static public String tittleAutumn = "Autumn";
    private String firstDay;
    private String lastDay;
    private double mediumTepriche;
    private Seazon(String title, String firstDay, String lastDay, double mediumTepriche){
        this.title = title;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.mediumTepriche = mediumTepriche;
    }
    public String abuotSeason(){
        return "it's " + this.title.toLowerCase() + ". Madium tempriche " + mediumTepriche + ". This season of year starts the "+ this.firstDay + " and end the " + this.lastDay + ".";
    }
    final public String getTitle(){
        return this.title;
    }
    public void getDecription(){
        switch (title) {
            case "Summer":
            case "Spring":
                System.out.println("warm season of year");
                break;
            case "Winter":
            case "Autumn":
                System.out.println("cold season of year");
                break;
        }
    }
}
