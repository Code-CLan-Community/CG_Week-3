package searchtarget;

// Creating class LinearSearch to implement Linear Search Algorithm
public class LinearSearch
{
    // Method to find target element using Linear Search
    public int findTarget(int[] arr,int target)
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        // Target element not found
        return -1;
    }
}
