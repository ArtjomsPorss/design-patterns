package behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> items;
    private String owner;

    public Inventory(String owner) {
        this.owner = owner;
        this.items = new ArrayList<>();
    }

    public void add(String item) {
        this.items.add(item);
    }

    public String getOwner() {
        return this.owner;
    }
}
