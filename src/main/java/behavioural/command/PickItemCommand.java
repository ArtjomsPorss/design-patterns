package behavioural.command;

public class PickItemCommand implements ICommand{
    Inventory inventory;
    String item;

    public PickItemCommand(Inventory inventory, String item) {
        this.inventory = inventory;
        this.item = item;
    }

    @Override
    public void execute() {
        this.addItem();
    }

    private void addItem() {
        this.inventory.add(item);
        System.out.println(String.format("%s is added to %s's inventory", this.item, this.inventory.getOwner()));
    }
}
