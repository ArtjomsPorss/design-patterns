package structural.composite;

public class MainComposite {
    public static void main(String[] args) {
        Teacher principal = new Teacher("PC Principal", "Principal");
        Teacher assistantPrincipal = new Teacher("Strong Woman", "Assistant Principal");
        Teacher elementaryTeacher = new Teacher("Mr Garrison", "Elementary Teacher");
        Teacher counselor = new Teacher("Mr Murkay", "Counselor");

        principal.addSubordinate(assistantPrincipal);
        assistantPrincipal.addSubordinate(elementaryTeacher);
        assistantPrincipal.addSubordinate(counselor);

        System.out.println(principal);
    }
}
