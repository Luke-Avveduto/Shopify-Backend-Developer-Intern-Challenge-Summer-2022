import java.time.LocalDateTime;
import java.util.List;

/**
 * This event triggers the creation of a shipment that can send items out of the inventory to be sent somewhere else
 */
public class ItemShipmentEvent implements Event{

    private LocalDateTime departureDate;
    private final String[] itemNames;
    private final int[] itemAmounts;
    private final String destination;
    private final String origin;

    /**
     * This creates a new ItemShipmentEvent object.
     * @param itemNames the item names that are in the shipment
     * @param itemAmounts the item amounts that in the shipment
     * @param destination the address the shipment is to go to
     * @param origin the location the shipment came from
     */
    public ItemShipmentEvent(String[] itemNames, int[] itemAmounts, String destination, String origin){
        this.itemNames = itemNames;
        this.itemAmounts = itemAmounts;
        this.destination = destination;
        this.origin = origin;
    }

    /**
     * When handled this event will create more events that will remove the items from the inventory of the manager
     * handling this event and then create a shipment object which will then be stored in the inventory for further
     * processing
     * @param inv the inventory from which the items are been taken from
     * @param manager the manager handling this event
     */
    @Override
    public void run(Inventory inv, InventoryManager manager) {
        for(int i = 0; i < this.itemNames.length; i++){

            manager.addEvent(new ModifyItemEvent(this.itemNames[i],
                    inv.getItem(this.itemNames[i]).getQuantity() - this.itemAmounts[i]));
        }
        inv.addShipment(new Shipment(this.itemNames, this.itemAmounts, this.destination, this.origin));
    }
}
