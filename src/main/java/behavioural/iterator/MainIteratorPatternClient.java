package behavioural.iterator;

import java.util.Arrays;

public class MainIteratorPatternClient {
    public static void main(String[] args) {
        Iterable students = new StudentCollection(Arrays.asList("John", "Alice", "Christie", "David"));
        Iterable employees = new EmployeeCollection(Arrays.asList("Lorna", "James", "Siobhan", "Alfred"));

        Iterator si = students.getIterator();
        System.out.println("Iterating over students:");
        while(si.hasNext()){
            System.out.println(si.getNext());
        }

        Iterator ei = employees.getIterator();
        System.out.println("Iterating over employees:");
        while(ei.hasNext()){
            System.out.println(ei.getNext());
        }
    }
}
