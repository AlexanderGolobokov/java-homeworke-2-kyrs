package zadanie_11.prak_6;

public class Temperature {
    public static double K2F(double Kelvin){
        return 1.8 * (Kelvin - 273) + 32;
    }
    public static double F2K(double Faringate){
        return (Faringate + 459.67) * 5 / 9;
    }
}
