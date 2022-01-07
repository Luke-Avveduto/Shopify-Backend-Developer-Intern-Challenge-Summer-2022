import java.time.LocalDateTime;


public class Item {

    private String name;
    private final LocalDateTime dateEntered;
    private LocalDateTime dateModified;
    private int quantity;

    /**
     * This creates a new item that can be stored in the inventory
     * @param name the name of the item stored as string
     * @param dateEntered the date the item was created stored using a <java.time.LocalDateTime> object
     * @param dateModified the date the item was last modified stored using a <java.time.LocalDateTime> object
     * @param quantity the number of the same item stored in the inventory represented as an int
     */
    public Item(String name, LocalDateTime dateEntered, LocalDateTime dateModified, int quantity) {
        this.name = name;
        this.dateEntered = dateEntered;
        this.dateModified = dateModified;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public LocalDateTime getDateEntered() {
        return dateEntered;
    }
    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setName(String name){
        this.name = name;
        this.dateModified = LocalDateTime.now();
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.dateModified = LocalDateTime.now();
    }

}
