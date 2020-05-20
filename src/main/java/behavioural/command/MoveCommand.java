package behavioural.command;

public class MoveCommand implements ICommand {

    GameMap map;
    String player;
    String location;

    public MoveCommand(GameMap map, String player, String location) {
        this.map = map;
        this.player = player;
        this.location = location;
    }

    @Override
    public void execute() {
        this.moveToLocation();
    }

    private void moveToLocation() {
        System.out.println(String.format("%s is moving to %s", this.player, this.location));
        this.map.moveToLocation(this.player, this.location);
    }
}
