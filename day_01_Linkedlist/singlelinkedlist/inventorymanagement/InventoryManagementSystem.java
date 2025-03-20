

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addAtBeginning("Laptop", 101, 10, 750.00);
        inventory.addAtEnd("Mouse", 102, 50, 20.00);
        inventory.addAtPosition(2, "Keyboard", 103, 30, 40.00);

        System.out.println("All Inventory Items:");
        inventory.displayAll();

        System.out.println("\nSearching for Item ID 102:");
        inventory.searchByItemID(102);

        System.out.println("\nUpdating Quantity for Item ID 103:");
        inventory.updateQuantity(103, 25);
        inventory.displayAll();

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nRemoving Item ID 101:");
        inventory.removeByItemID(101);
        inventory.displayAll();
    }
}
