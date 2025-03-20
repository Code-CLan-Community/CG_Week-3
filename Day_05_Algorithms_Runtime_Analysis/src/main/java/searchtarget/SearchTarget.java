package searchtarget;
// Importing Arrays class
import java.util.Arrays;
// Creating main class SearchTarget to analyze runtime complexity of linear and binary search
public class SearchTarget
{
    // MainClass method
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,3,5,7,6,10,67,2,56,25,90,56,48,78,34,56,99,12,67,39,49,89,46,86,1,7,9,6,5,45,77,33,89};
        int target = 9;

        // Creating objects of classes
        LinearSearch search1 = new LinearSearch();
        BinarySearch search2 = new BinarySearch();

        // Calculating time taken by Linear Search Algorithm
        long startTimeOfLinearSearch = System.nanoTime();
        int found1 = search1.findTarget(arr,target);
        long endTimeOfLinearSearch = System.nanoTime();
        System.out.println("\nTime taken by Linear Search Algorithm " + (endTimeOfLinearSearch - startTimeOfLinearSearch));
        System.out.println(found1 != -1 ? "Target Element Found" : "Target Element Not Found");

        // Sorting array for Binary Search
        Arrays.sort(arr);
        // Calculating time taken by Binary Search Algorithm
        long startTimeOfBinarySearch = System.nanoTime();
        int found2 = search2.findTarget(arr,target);
        long endTimeOfBinarySearch = System.nanoTime();
        System.out.println("\nTime taken by Binary Search Algorithm " + (endTimeOfBinarySearch - startTimeOfBinarySearch));
        System.out.println(found2 != -1 ? "Target Element Found" : "Target Element Not Found");
    }
}
