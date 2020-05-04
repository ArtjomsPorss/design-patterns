package creational.factory_method;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Truck delivers by road");
    }
}
