package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection implements Iterable {
    private List<String> employees;

    public EmployeeCollection(List<String> newEmployees) {
        this.employees = new ArrayList<>();
        newEmployees.forEach(this::addEmployee);
    }

    private void addEmployee(String employee) {
        this.employees.add(employee);
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator(employees);
    }
}
