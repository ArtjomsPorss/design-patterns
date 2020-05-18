package creational.builder;

public class GamingPcBuilder extends APcBuilder {

    public GamingPcBuilder() {
        reset();
    }

    @Override
    public void addMotherboard() {
        this.pc.add("High-end motherboard");
    }

    @Override
    public void addProcessor() {
        this.pc.add("16-core processor");
    }

    @Override
    public void addRam() {
        this.pc.add("32GB RAM");
    }

    @Override
    public void addHardDrive() {
        this.pc.add("1TB SSD");
    }

    @Override
    public void addGraphicsCard() {
        this.pc.add("High-end graphics card");
    }

    @Override
    public void addPowerBlock() {
        this.pc.add("High Output power block");
    }

    @Override
    public void addWifi() {
        this.pc.add("Wifi included");
    }

    @Override
    public void addMonitor() {
        this.pc.add("Large monitor with high responsiveness, picture quality, contrast and color");
    }

    @Override
    public PC getPc() {
        return this.pc;
    }
}
