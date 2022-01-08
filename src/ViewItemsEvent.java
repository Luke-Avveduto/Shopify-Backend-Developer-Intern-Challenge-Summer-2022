/**
 * This class represents an event that shows the user the existing elements in the inventory of an inventory manager
 */
public class ViewItemsEvent implements Event{

    /**
     * Creates a new ViewItemsEvent object
     */
    public ViewItemsEvent(){
    }

    /**
     * When handled this event shows the user all the items in the inventory
     * @param inv the inventory that is being shown to the user
     * @param manager the manager that is handling this event
     */
    @Override
    public void run(Inventory inv, InventoryManager manager){
        for(String itemDetails: inv.viewItems()){
            System.out.println(itemDetails);
        }
    }
}
