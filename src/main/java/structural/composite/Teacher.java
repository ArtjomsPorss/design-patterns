package structural.composite;

import java.util.ArrayList;
import java.util.List;

@lombok.EqualsAndHashCode
@lombok.ToString
public class Teacher implements ITeacher {
    private String name;
    private String department;
    private List<ITeacher> subordinates;

    public Teacher(String name, String department) {
        this.name = name;
        this.department = department;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(ITeacher teacher) {
        this.subordinates.add(teacher);
    }


}
