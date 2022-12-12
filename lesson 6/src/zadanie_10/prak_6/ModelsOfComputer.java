package zadanie_10.prak_6;

public enum ModelsOfComputer {
    MAC_BOOK_M1_PRO("MacBookPro", new Processor("M1 Max", 40, 256), new Monitor(14, "8K"), new Memory(4096, "SSD")),
    IMAC("IMac", new Processor("M1 Ultra", 60, 512), new Monitor(28, "8K"), new Memory(8192, "SSD")),
    OMEN("Omen", new Processor("i9", 20, 256), new Monitor(17, "4K"), new Memory(4096, "SSD")),
    LENOVO("Lenovo", new Processor("i7", 16, 128), new Monitor(13, "4K"), new Memory(2048, "SSD"));
    private Computer computer;
    ModelsOfComputer(String model, Processor processor, Monitor monitor, Memory memory){
        this.computer = new Computer(model, processor, memory, monitor);
    }
    public static void getCatalog(){
        System.out.println("Our computer's catalog:\n");
        int k = 1;
        for (ModelsOfComputer i : ModelsOfComputer.values()){
            System.out.println(k + ". " + i.getComputer().getModel());
            k++;
        }
        System.out.println("\n");
    }
    public Computer getComputer(){
        return  this.computer;
    }
    public static boolean isComp(String model){
        for (ModelsOfComputer i : ModelsOfComputer.values()){
            if (i.getComputer().getModel().equals(model)){
                return true;
            }
        }
        return false;
    }
    public static Computer isComputer(String model){
        for (ModelsOfComputer i : ModelsOfComputer.values()){
            if (i.getComputer().getModel().equals(model)){
                return i.getComputer();
            }
        }
        return null;
    }
}
