package behavioural.memento;

/**
 * Exposes public API, not revealing actual snapshots and their data
 */
public interface IMemento {
    /**
     * Some public method to get IMemento metadata
     * @return
     */
    public long getTimeStamp();

    /**
     * Revert state of the Originator
     */
    public void revertState();
}
