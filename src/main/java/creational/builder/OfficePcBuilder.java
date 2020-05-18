package creational.builder;

public class OfficePcBuilder extends APcBuilder {

    public OfficePcBuilder() {
        reset();
    }

    @Override
    public void addMotherboard() {
        this.pc.add("basic motherboard with integrated graphics card");
    }

    @Override
    public void addProcessor() {
        this.pc.add("basic 4-core processor");
    }

    @Override
    public void addRam() {
        this.pc.add("4GB RAM");
    }

    @Override
    public void addHardDrive() {
        this.pc.add("256GB SSD");
    }

    @Override
    public void addGraphicsCard() {
        this.pc.add("none");
    }

    @Override
    public void addPowerBlock() {
        this.pc.add("low output power block");
    }

    @Override
    public void addWifi() {
        this.pc.add("WIFI included");
    }

    @Override
    public void addMonitor() {
        this.pc.add("large monitor with optimised for reading");
    }

    @Override
    public PC getPc() {
        return this.pc;
    }
}
