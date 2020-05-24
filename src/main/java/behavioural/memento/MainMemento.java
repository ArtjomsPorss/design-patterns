package behavioural.memento;

/**
 * GoF Definition:
 * Without violating the encapsulation, capture and externalize an object's
 * internal state so that the object can be restored to this state later.
 *
 */
public class MainMemento {
    public static void main(String[] args) {
        System.out.println("::: Memento pattern demo :::");

        Originator o = new Originator();
        Caretaker c = new Caretaker();
        c.saveState(o.snapshot());
        o.setState("Some new text");
        c.saveState(o.snapshot());
        o.setState("Dap-diri-dap-diri-doo");
        c.revertState();
        c.revertState();

    }
}
