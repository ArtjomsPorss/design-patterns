package behavioural.command;

public class AttackCommand implements ICommand {

    private final String source;
    private final String target;

    public AttackCommand(String source, String target) {
        this.source = source;
        this.target = target;
    }
    @Override
    public void execute() {
        this.attack();
    }

    public void attack() {
        System.out.println(String.format("%s is attacking the %s", this.source, this.target));
    }
}
