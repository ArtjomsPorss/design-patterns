package behavioural.memento;

public class Originator {
    private String state = "";

    public IMemento snapshot() {
        return new Snapshot(this, this.state);
    }

    public void setState(String newState) {
        this.state = newState;
        System.out.println("New State: " + this.state);
    }

    private void revertState(String state) {
        this.state = state;
        System.out.println("Reverted to: " + this.state);
    }

    /**
     * An implementation of IMemento that stores reference to editor and its state snapshot.
     * Implements public API of IMemento to revertState()
     */
    private class Snapshot implements IMemento {
        private Originator originator;
        private String oldState;
        private long timestamp;

        /**
         * @param originator reference to revert state using revertState()
         * @param oldState to save for later revert
         */
        private Snapshot(Originator originator, String oldState) {
            this.oldState = oldState;
            this.timestamp = System.currentTimeMillis();
            this.originator = originator;
        }
        private String getOldState() {
            return this.oldState;
        }

        @Override
        public long getTimeStamp() {
            return this.timestamp;
        }

        @Override
        public void revertState() {
            this.originator.revertState(oldState);
        }
    }
}
