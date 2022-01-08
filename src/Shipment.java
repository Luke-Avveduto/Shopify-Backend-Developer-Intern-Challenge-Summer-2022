import javax.sound.sampled.FloatControl;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This class extends the inventory class to represent a shipment, a collection of items that will be sent somewhere
 * else.
 */
public class Shipment extends Inventory{

    private final LocalDateTime departureDate;
    private final String destination;
    private final String origin;

    /**
     * This creates a new shipment object which will be sent to the address of the destination
     * @param itemNames the item names that are in the shipment
     * @param itemAmounts the item amounts that in the shipment
     * @param destination the location the items are going
     * @param origin the location of where the items came from
     */
    public Shipment(String[] itemNames, int[] itemAmounts, String destination, String origin){
        for(int i = 0; i < itemNames.length; i++){
            this.addItem(new Item(itemNames[i], LocalDateTime.now(), LocalDateTime.now(), itemAmounts[i]));
        }
        this.destination = destination;
        this.origin = origin;
        this.departureDate = LocalDateTime.now();
    }

}
