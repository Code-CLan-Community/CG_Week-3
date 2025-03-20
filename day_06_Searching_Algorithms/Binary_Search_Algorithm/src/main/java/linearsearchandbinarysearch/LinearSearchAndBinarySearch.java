package linearsearchandbinarysearch;
// Importing Arrays class
import java.util.Arrays;
// Creating class LinearSearchAndBinarySearch to implement linear and binary search algorithm
public class LinearSearchAndBinarySearch
{
    // Method to implement linear search algorithm
    public static int linearSearch(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
            {
                return arr[i];
            }
        }
        return -1;
    }

    // Method to implement binary search algorithm
    public static int binarySearch(int[] arr, int target)
    {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] arr = { 3, 2, -2, 4, 9, 6, 1};

        int firstPositiveInteger = linearSearch(arr);
        int targetindex = binarySearch(arr,9);

        // Checking first missing positive integer is found or not
        if(firstPositiveInteger != -1)
        {
            System.out.println("\nFirst missing positive integer is " + firstPositiveInteger);
        }
        else
        {
            System.out.println("\nNo negative integer found");
        }

        // Checking index of the given target number is found or not
        if(targetindex != -1)
        {
            System.out.println("Index of the given target number is " + targetindex);
        }
        else
        {
            System.out.println("Target number is not found");
        }
    }
}
