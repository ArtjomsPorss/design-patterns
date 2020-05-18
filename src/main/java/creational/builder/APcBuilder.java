package creational.builder;

public abstract class APcBuilder implements IPcBuilder {
    protected PC pc;

    protected void reset() {
        this.pc = new PC();
    }
}
