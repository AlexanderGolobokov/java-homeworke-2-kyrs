package lab4.prak_4;

public enum ModelsOfCompucter {
    MAC_BOOK_PRO("MacBook Pro", new Processor("M1 MAX", "chip", 10, 32), new Memory("SSD", 4096), new Monitor("Retina", 14.2, 60)),
    MAC_BOOK_AIR("MacBook Air", new Processor("M2", "chip", 10, 16), new Memory("SSD", 2048), new Monitor("Retina", 14.2, 60)),
    HP_OMEN("HP Omen", new Processor("Intel i7", "processor", 8), new Memory("SSD", 4096), new Monitor("2K", 17, 60)),
    LENOVO("Lenovo Yoga", new Processor("Intel i7", "processor", 8), new Memory("SSD", 4096), new Monitor("4K", 16, 120));
    private String name;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    ModelsOfCompucter(String name, Processor processor, Memory memory, Monitor monitor){
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
