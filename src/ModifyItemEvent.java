/**
 * This class represents an event that modifies existing elements in the inventory of an inventory manager
 */
public class ModifyItemEvent implements Event{
    String itemName;
    int newItemQuantity;

    /**
     * Creates a new ModifyItemEvent object
     * @param itemName the name of the item the user wants to be modified
     * @param newItemQuantity the new quantity of the item being modified
     */
    public ModifyItemEvent(String itemName, int newItemQuantity){
        this.itemName = itemName;
        this.newItemQuantity = newItemQuantity;
    }

    /**
     * When handled this event changes an item in the inventory
     * @param inv the inventory in which the change is being made
     * @param manager the manager that is handling this event
     */
    @Override
    public void run(Inventory inv, InventoryManager manager){
        inv.editItemQuantity(this.itemName, this.newItemQuantity);
    }
}
