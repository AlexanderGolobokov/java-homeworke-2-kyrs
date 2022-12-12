package zadanie_10.prak_6;

public class Computer {
    private String model;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer() {
        model = "no computer";
        processor = new Processor();
        memory = new Memory();
        monitor = new Monitor();
    }

    public Computer(String model, Processor processor, Memory memory, Monitor monitor) {
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
