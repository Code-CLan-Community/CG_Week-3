package searchtarget;

// Creating class BinarySearch to implement Binary Search Algorithm
public class BinarySearch
{
    // Method to find target element using Binary Search
    public int findTarget(int[] arr, int target)
    {
        int low = 0, high = arr.length-1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        // Target element not found
        return -1;
    }
}
