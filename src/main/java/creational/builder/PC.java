package creational.builder;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class PC {
    protected List<String> peripherals;

    public PC() {
        this.peripherals = new LinkedList<>();
    }

    public void add(String peripheral) {
        this.peripherals.add(peripheral);
    }
}
