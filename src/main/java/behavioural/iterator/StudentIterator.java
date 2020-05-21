package behavioural.iterator;

import java.lang.reflect.Array;

public class StudentIterator implements Iterator {
    private String[] students;
    private int currentPos = -1;

    public StudentIterator(String[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return currentPos + 1 >= students.length ? false : true;
    }

    @Override
    public String getNext() throws OutOfElementsException {
        try {
            return students[++currentPos];
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            throw new OutOfElementsException(aioobe.getMessage());
        }
    }
}
