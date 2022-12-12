package zadanie_10.prak_6;

public class Processor {
    private String name;
    private int core;
    private int flows;

    public Processor() {
        this.name = "no name";
        this.core = 0;
        this.flows = 0;
    }
    public Processor(String name, int core, int flows){
        this.name = name;
        this.core = core;
        this.flows = flows;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getFlows() {
        return flows;
    }

    public void setFlows(int flows) {
        this.flows = flows;
    }
}
