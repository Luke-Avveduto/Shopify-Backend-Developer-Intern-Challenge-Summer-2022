/**
 * This class represents an event that removes existing elements in the inventory of an inventory manager
 */
public class RemoveItemEvent implements Event{
    String itemName;

    /**
     * Creates a new RemoveItemEvent object
     * @param itemName the name of the item to be removed
     */
    public RemoveItemEvent(String itemName){
        this.itemName = itemName;
    }

    /**
     * When handled this event removes an item in the inventory
     * @param inv the inventory in which the change is being made
     * @param manager the manager that is handling this event
     */
    @Override
    public void run(Inventory inv, InventoryManager manager){
        inv.removeItem(this.itemName);
    }
}
