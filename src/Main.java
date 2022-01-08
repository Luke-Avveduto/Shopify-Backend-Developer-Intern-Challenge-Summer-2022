import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Inventory inv = new Inventory();

        InventoryManager manager = new InventoryManager(inv);

        boolean running = true;

        while(running){
            manager.handleEvents();

            System.out.println("-------------------------------------");
            System.out.println("Enter 1 to create an item");
            System.out.println("Enter 2 to remove an item");
            System.out.println("Enter 3 to modify an existing item");
            System.out.println("Enter 4 to view all existing items");
            System.out.println("Enter 5 to quit");
            System.out.println("What would you like to do: ");
            int input = s.nextInt();

            switch (input){
                case 1:
                    manager.addEvent(itemCreationDialog(s));
                    break;
                case 2:
                    manager.addEvent(itemRemovalDialog(s));
                    break;
                case 3:
                    manager.addEvent(itemModificationDialog(s));
                case 4:
                    manager.addEvent(new ViewItemsEvent());
                    break;
                case 5:
                    running = false;
            }

        }
    }

    /**
     * This method asks the user for the information needed to modify an item
     * @param s the scanner used to interact with the user
     * @return An ModifyItemEvent that will trigger the modification of the item the user asked for
     */
    private static Event itemModificationDialog(Scanner s) {
        String itemName;
        int newQuantity;
        System.out.println("Enter the name of the item you want to modify:");
        itemName = s.next();
        System.out.println("Enter the new quantity of the item:");
        newQuantity = s.nextInt();

        return new ModifyItemEvent(itemName, newQuantity);
    }

    /**
     * This method asks the user for the information needed to remove an item
     * @param s the scanner used to interact with the user
     * @return An RemoveItemEvent that will trigger the removal of the item the user asked for
     */
    private static Event itemRemovalDialog(Scanner s) {
        String itemName;
        System.out.println("Enter the name of the item you wish to remove:");
        itemName = s.next();
        return new RemoveItemEvent(itemName);
    }

    /**
     * This method asks the user for the information needed to create an item
     * @param s the scanner used to interact with the user
     * @return An CreateItemEvent that will trigger the creation of the item the user asked for
     */
    private static Event itemCreationDialog(Scanner s){
        String itemName;
        int itemQuantity;

        System.out.println("Enter the name of the item you wish to create:");
        itemName = s.next();
        System.out.println("Enter the quantity of the item that is to be stored:");
        itemQuantity = s.nextInt();

        return new CreateItemEvent(itemName, itemQuantity);
    }

}
