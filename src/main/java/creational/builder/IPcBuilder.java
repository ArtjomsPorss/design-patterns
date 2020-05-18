package creational.builder;

public interface IPcBuilder {
    void addMotherboard();
    void addProcessor();
    void addRam();
    void addHardDrive();
    void addGraphicsCard();
    void addPowerBlock();
    void addWifi();
    void addMonitor();
    PC getPc();
}
