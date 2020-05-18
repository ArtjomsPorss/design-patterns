package creational.builder;

public class PcBuilderDirector {
    private IPcBuilder _builder;

    public void build(IPcBuilder builder) {
        this._builder = builder;
        this._builder.addMotherboard();
        this._builder.addProcessor();
        this._builder.addRam();
        this._builder.addHardDrive();
        this._builder.addGraphicsCard();
        this._builder.addPowerBlock();
        this._builder.addWifi();
        this._builder.addMonitor();
    }
}
