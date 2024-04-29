package facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.start();
        memory.load(0, hardDrive.read(0, 1024));
        System.out.println("Computer started");
    }

    public void shutdown() {
        cpu.shutdown();
        System.out.println("Computer shut down");
    }
}