import java.util.HashMap;
import java.util.Map;

/**
 * This class represents an inventory that stores Item objects. The items are stored via a hash map in order to keep
 * lookup times fast. The key is the name of the item the value is the Item object itself.
 */

public class Inventory {

    //All items in the inventory will be stored in here with the key being the item's name as a String.
    private final Map<String, Item> items;

    /**
     * Creates a new instance of the inventory class.
     */
    public Inventory(){
        this.items = new HashMap<>();
    }

    /**
     * Adds a new item object to the inventory
     * @param item the item to be added to the inventory
     */
    public void addItem(Item item){
        items.put(item.getName(), item);
    }

    /**
     * Removes the item with key itemName from the inventory if it exists.
     * @param itemName the name of the item to be removed
     * @return true if the item exists and was removed, false otherwise
     */
    public boolean removeItem(String itemName){
        return items.remove(itemName) != null;
    }

    /**
     * Returns a string representation of the item in the inventory with itemName as its name.
     * @param itemName the name of the item that is to be viewed
     * @return a string representation of the item in the inventory with itemName as its name.
     */
    public String viewItem(String itemName){
        return items.get(itemName).toString();
    }

    /**
     * Changes the quantity of the item in the inventory with the name itemName to newQuantity
     * @param itemName the name of the item to be changed
     * @param newQuantity the quantity the item's quantity will be changed to
     */
    public void editItemQuantity(String itemName, int newQuantity){
        this.items.get(itemName).setQuantity(newQuantity);
    }
}
