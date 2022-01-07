import java.util.HashMap;
import java.util.Map;

/**
 * This class represents an inventory that stores Item objects. The items are stored via a hash map in order to keep
 * lookup times fast. The key is the name of the item the value is the Item object itself.
 */

public class Inventory {


    private final Map<String, Item> items;


    public Inventory(){
        this.items = new HashMap<String, Item>();
    }


    public void addItem(Item item){
        items.put(item.getName(), item);
    }

    public boolean removeItem(Item item){
        return items.remove(item.getName()) != null;
    }

    public String viewItem(String itemName){
        return items.get(itemName).toString();
    }

    public void editItemName(String itemName, String newName){
        this.items.get(itemName).setName(newName);
    }
    public void editItemQuantity(String itemName, int newQuantity){
        this.items.get(itemName).setQuantity(newQuantity);
    }
}
