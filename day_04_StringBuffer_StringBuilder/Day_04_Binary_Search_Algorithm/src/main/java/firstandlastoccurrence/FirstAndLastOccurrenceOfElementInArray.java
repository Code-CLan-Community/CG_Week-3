package firstandlastoccurrence;

// Creating class FirstAndLastOccurrenceOfElementInArray to find first and last occurrence of target element in array
public class FirstAndLastOccurrenceOfElementInArray
{
    // Method to find the first occurrence of the target element using Binary Search
    public static int findFirstOccurrence(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
            {
                result = mid;
                high = mid - 1;
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }

    // Method to find the last occurrence of the target element using Binary Search
    public static int findLastOccurrence(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
            {
                result = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target)
            {
                    low = mid + 1;
            }
            else
            {
                    high = mid - 1;
            }
        }
        return result;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,7,9,9};
        // Calling methods
        int firstOccurrence = findFirstOccurrence(arr, 9);
        int lastOccurrence = findLastOccurrence(arr, 9);

        // Checking index of the first occurrence of given target number is found or not
        if(firstOccurrence != -1)
        {
            System.out.println("First occurrence index is " + firstOccurrence);
        }
        else
        {
            System.out.println("First occurrence index not found");
        }

        // Checking index of the last occurrence of given target number is found or not
        if(lastOccurrence != -1)
        {
            System.out.println("Last occurrence index is " + lastOccurrence);
        }
        else
        {
            System.out.println("Last occurrence index not found");
        }
    }
}
