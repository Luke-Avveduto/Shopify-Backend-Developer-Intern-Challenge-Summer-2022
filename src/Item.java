import java.time.LocalDateTime;

/**
 * This class represents an item stored in the inventory. Each time contains a name as a String, the date the item was
 * first stored in the inventory, how many of the items are in the inventory and when that last time that quantity was
 * updated. Dates are stored using <java.time.LocalDateTime></> objects.
 */
public class Item {

    private String name;
    private final LocalDateTime dateEntered;
    private LocalDateTime dateModified;
    private int quantity;

    /**
     * This creates a new item that can be stored in the inventory
     * @param name the name of the item stored as string
     * @param dateEntered the date the item was created stored using a <java.time.LocalDateTime></> object
     * @param dateModified the date the item was last modified stored using a <java.time.LocalDateTime></> object
     * @param quantity the number of the same item stored in the inventory represented as an int
     */
    public Item(String name, LocalDateTime dateEntered, LocalDateTime dateModified, int quantity) {
        this.name = name;
        this.dateEntered = dateEntered;
        this.dateModified = dateModified;
        this.quantity = quantity;
    }

    /**
     * Returns the name of the item
     * @return the name of the item as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the quantity of items stored
     * @return the quantity of items stored as an int
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Returns the date the item was first created
     * @return the date the item was first created as a <java.time.LocalDateTime></> object
     */
    public LocalDateTime getDateEntered() {
        return dateEntered;
    }
    /**
     * Returns the date the item was last modified
     * @return the date the item was last modified as a <java.time.LocalDateTime></> object
     */
    public LocalDateTime getDateModified() {
        return dateModified;
    }

    /**
     * Sets the quantity of the item
     * @param quantity the new quantity of the item
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.dateModified = LocalDateTime.now();
    }

    @Override
    public String toString(){
        return "Item Name: " + this.name + "\n" +
                        "Item Quantity: " + this.quantity + "\n" +
                        "Date Created: " + this.dateEntered.toString() + "\n" +
                        "Date Modified: " + this.dateModified.toString();
    }

}
