/**
 * This is an interface for all the events that the inventory manager will have to handle.
 */
public interface Event {

    void run(Inventory inv, InventoryManager manager);

}
