class InventoryManagement {
    private Item head;

    public void addAtBeginning(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    public void addAtPosition(int position, String itemName, int itemID, int quantity, double price) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Item newItem = new Item(itemName, itemID, quantity, price);
        if (position == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }

        Item temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }

        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeByItemID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemID == itemID) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemID != itemID) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item with ID " + itemID + " not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantity(int itemID, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemID);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found");
    }

    public void searchByItemID(int itemID) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                System.out.println("Item Found: " + temp.itemName + " (ID: " + temp.itemID + ", Quantity: " + temp.quantity + ", Price: " + temp.price + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found");
    }

    public void searchByItemName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: " + temp.itemName + " (ID: " + temp.itemID + ", Quantity: " + temp.quantity + ", Price: " + temp.price + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with name " + itemName + " not found");
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No inventory items to display");
            return;
        }

        Item temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", ID: " + temp.itemID + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}