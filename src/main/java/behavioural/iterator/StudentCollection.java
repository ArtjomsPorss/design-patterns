package behavioural.iterator;

import java.util.List;

public class StudentCollection implements Iterable {

    private String[] students;

    public StudentCollection(List<String> newStudents) {
        newStudents.forEach(this::addStudent);
    }

    private void addStudent(String student) {
        if(students == null) {
            students = new String[]{student};
        } else {
            String[] newarr = new String[students.length + 1];
            System.arraycopy(students, 0, newarr, 0, students.length);
            students = newarr;
            newarr[newarr.length-1] = student;
        }
    }

    @Override
    public Iterator getIterator() {
        return new StudentIterator(students);
    }
}
