package creational.factory_method;

public enum TransportTypes {
    truck("truck"), boat("boat");

    private final String transportType;

    private TransportTypes(String type) {
        this.transportType = type;
    }

    @Override
    public String toString() {
        return this.transportType;
    }
}
