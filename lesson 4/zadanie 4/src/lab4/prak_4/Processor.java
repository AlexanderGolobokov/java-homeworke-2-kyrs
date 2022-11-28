package lab4.prak_4;

public class Processor {
    private String name;
    private String type;
    private int nucleuses;
    private int CPU;
    private int GPU;
    {
        this.name = "no name";
        this.type = "no type";
        this.nucleuses = 0;
        this.CPU = 0;
        this.GPU = 0;
    }
    Processor(){}
    Processor(String name, String type, int nucleuses){
        this.name = name;
        this.type = type;
    }
    Processor(String name, String type, int CPU, int GPU){
        this.name = name;
        this.type = type;
        this.CPU = CPU;
        this.GPU = GPU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNucleuses() {
        return nucleuses;
    }

    public void setNucleuses(int nucleuses) {
        if(CPU == 0 && GPU == 0) {
            this.nucleuses = nucleuses;
        }
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        if (nucleuses == 0) {
            this.CPU = CPU;
        }
    }

    public int getGPU() {
        return GPU;
    }

    public void setGPU(int GPU) {
        if (nucleuses == 0) {
            this.GPU = GPU;
        }
    }
}
