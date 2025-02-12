package datastructuresearching;
import java.util.HashSet;
import java.util.TreeSet;

// Creating class ComparingDifferentDataStructureSearching to compare searching time of different data structure
public class ComparingDifferentDataStructureSearching
{
    // Method to search target element in array using Linear Search Algorithm
    public static int searchInArray(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)   
                return i;
        }
        return -1;
    }

    // Method to search target element in HashSet
    public static boolean searchInHashSet(HashSet<Integer> hashSet, int target)
    {
        return hashSet.contains(target);
    }

    // Method to search target element in TreeSet
    public static boolean searchInTreeSet(TreeSet<Integer> treeSet, int target)
    {
        return treeSet.contains(target);
    }

    // Main Method
    public static void main(String[] args)
    {
        int[] arr = new int[1000000];

        // Adding elements into array
        for (int i = 0; i < 1000000; i++)
        {
            arr[i] = i;
        }

        // Adding elements into HashSet
        HashSet <Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 1000000; i++)
        {
            hashSet.add(i);
        }

        // Adding elements into TreeSet
        TreeSet <Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 1000000; i++)
        {
            treeSet.add(i);
        }

        // Calculating searching time of Array
        long startTimeOfArraySearch = System.nanoTime();
        searchInArray(arr, 69955);
        long endTimeOfArraySearch = System.nanoTime();
        System.out.println("Time Taken By Array Search " + (endTimeOfArraySearch - startTimeOfArraySearch));

        // Calculating searching time of HashSet
        long startTimeOfHashSet = System.nanoTime();
        searchInHashSet(hashSet, 69955);
        long endTimeOfHashSet = System.nanoTime();
        System.out.println("Time Taken By HashSet " + (endTimeOfHashSet - startTimeOfHashSet));

        // Calculating searching time of TreeSet
        long startTimeOfTreeSet = System.nanoTime();
        searchInTreeSet(treeSet, 69955);
        long endTimeOfTreeSet = System.nanoTime();
        System.out.println("Time Taken By TreeSet " + (endTimeOfTreeSet - startTimeOfTreeSet));
    }
}
