import java.util.ArrayList;
import java.util.LinkedList;

class CustomizeHashMap {

    static class Entry {

        int key, value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 100; // Fixed size of the array
    private final ArrayList<LinkedList<Entry>> map;

    public CustomizeHashMap() {
        map = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            map.add(new LinkedList<>());
        }
    }

    private int getIndex(int key) {
        return Math.abs(key) % SIZE; // Ensures index is within bounds
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        for (Entry entry : map.get(index)) {
            if (entry.key == key) {
                entry.value = value; // Update value if key already exists
                return;
            }
        }
        map.get(index).add(new Entry(key, value)); // Add new key-value pair
    }

    public int get(int key) {
        int index = getIndex(key);
        for (Entry entry : map.get(index)) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1; // Return -1 if key is not found
    }

    public void remove(int key) {
        int index = getIndex(key);
        map.get(index).removeIf(entry -> entry.key == key); // Remove entry if key matches
    }

    public boolean containsKey(int key) {
        int index = getIndex(key);
        for (Entry entry : map.get(index)) {
            if (entry.key == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CustomizeHashMap hashMap = new CustomizeHashMap();

        // Insert values
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(102, 30); // Collision handling test

        // Retrieve values
        System.out.println("Value for key 1: " + hashMap.get(1)); // 10
        System.out.println("Value for key 2: " + hashMap.get(2)); // 20
        System.out.println("Value for key 102: " + hashMap.get(102)); // 30
        System.out.println("Value for key 3 (Not Exist): " + hashMap.get(3)); // -1

        // Check key existence
        System.out.println("Contains key 2? " + hashMap.containsKey(2)); // true
        System.out.println("Contains key 99? " + hashMap.containsKey(99)); // false

        // Remove a key
        hashMap.remove(2);
        System.out.println("Value for key 2 after removal: " + hashMap.get(2)); // -1
    }
}
