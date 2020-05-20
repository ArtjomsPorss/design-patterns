package behavioural.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Client class sets up the Commands, passing Receivers of command and State into constructor.
 * Client then associates the Invokers of command with instantiated Commands.
 * The Invokers are triggered by events, e.g. user action, callback, invoker API is called.
 * Once triggered, Invoker calls its Command to execute.
 *
 * Here commands are buffered in a queue which is then executed.
 */
public class MainCommandClient {
    static Queue<ICommand> commandQueue = new LinkedList<>();

    public static void main(String[] args) {
        GameMap map = new GameMap();

        ICommand move = new MoveCommand(map, "Johan", "Tavern");
        commandQueue.offer(move);

        Inventory johnInventory = new Inventory("Johan");
        ICommand pickItem = new PickItemCommand(johnInventory, "Sword");
        commandQueue.offer(pickItem);

        ICommand attack = new AttackCommand("Johan", "Dragon");
        commandQueue.offer(attack);

        commandQueue.stream().forEach(ICommand::execute);
    }
}
