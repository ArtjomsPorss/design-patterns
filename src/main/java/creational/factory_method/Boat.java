package creational.factory_method;

public class Boat implements ITransport {

    @Override
    public void deliver() {
        System.out.println("Boat delivers by sea");
    }
}
