package creational.builder;

public class ServerPcBuilder extends APcBuilder {

    public ServerPcBuilder() {
        reset();
    }

    @Override
    public void addMotherboard() {
        this.pc.add("Motherboard for server machines");
    }

    @Override
    public void addProcessor() {
        this.pc.add("32 cores");
    }

    @Override
    public void addRam() {
        this.pc.add("64GB RAM");
    }

    @Override
    public void addHardDrive() {
        this.pc.add("16TB SSD");
    }

    @Override
    public void addGraphicsCard() {
        this.pc.add("none");
    }

    @Override
    public void addPowerBlock() {
        this.pc.add("Medium output power block");
    }

    @Override
    public void addWifi() {
        this.pc.add("none");
    }

    @Override
    public void addMonitor() {
        this.pc.add("none");
    }

    @Override
    public PC getPc() {
        return this.pc;
    }
}
