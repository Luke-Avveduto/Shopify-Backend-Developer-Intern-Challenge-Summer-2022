import java.util.LinkedList;
import java.util.Queue;

/**
 * A class which manages an inventory by keeping track of and then handling events that effect its inventory
 */
public class InventoryManager {

    Inventory inventory;
    Queue<Event> events;

    /**
     * Creates a new InventoryManager object with an empty event queue and with inv as its inventory
     * @param inv the Inventory this manager will manage
     */
    public InventoryManager(Inventory inv){
        this.inventory = inv;
        this.events = new LinkedList<>();
    }

    /**
     * Adds an event to the event queue that will eventually be handled
     * @param e the event to be added
     */
    public void addEvent(Event e){
        events.add(e);
    }

    /**
     * Handles all events currently in the event queue
     */
    public void handleEvents(){
        while(!this.events.isEmpty()){
            Event e = this.events.poll();
            e.run(inventory, this);
        }
    }

}
