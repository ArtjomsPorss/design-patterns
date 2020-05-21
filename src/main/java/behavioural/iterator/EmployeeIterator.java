package behavioural.iterator;

import java.util.List;

public class EmployeeIterator implements Iterator {
    private List<String> employees;
    private int pos = -1;

    public EmployeeIterator(List<String> employees) {
        this.employees = employees;
    }


    @Override
    public boolean hasNext() {
        return pos + 1 < employees.size() ? true : false;
    }

    @Override
    public String getNext() throws OutOfElementsException {
        try {
            return employees.get(++pos);
        } catch (IndexOutOfBoundsException ioobe) {
            throw new OutOfElementsException(ioobe.getMessage());
        }
    }
}
