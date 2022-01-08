import java.time.LocalDateTime;
/**
 * This class represents an event that creates a new elements in the inventory of an inventory manager
 */
public class CreateItemEvent implements Event{

    String itemName;
    int itemQuantity;

    /**
     * Creates a new CreateItemEvent object
     * @param itemName the name of the item to be created
     * @param itemQuantity the quantity the item is going to have
     */
    public CreateItemEvent(String itemName, int itemQuantity){
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }
    /**
     * When handled this event creates an item in the inventory
     * @param inv the inventory in which the change is being made
     * @param manager the manager that is handling this event
     */
    @Override
    public void run(Inventory inv, InventoryManager manager){
        inv.addItem(new Item(this.itemName, LocalDateTime.now(), LocalDateTime.now(), this.itemQuantity));
    }
}
