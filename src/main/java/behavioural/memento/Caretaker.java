package behavioural.memento;

import java.util.Stack;

/**
 * Caretaker doesn't know about IMemento implementation.
 * Caretaker stores IMemento's in history and can revert state to previous snapshot using IMemento public API IMemento.revertState()
 */
public class Caretaker {
    Stack<IMemento> history;

    public Caretaker() {
        this.history = new Stack<>();
    }

    public void saveState(IMemento snapshot) {
        this.history.push(snapshot);
    }

    public void revertState() {
        IMemento snapshot = this.history.pop();
        snapshot.revertState();
    }
}
