package peakelementinarray;
// Importing Arrays class
import java.util.Arrays;
// Creating class PeakElementInArray to find peak element in the array
public class PeakElementInArray
{
    // Method to implement binary search
    public static int binarySearch(int[] nums)
    {
        try
        {
            int low = 0;
            int high = nums.length-1;

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if(nums[mid] > nums[mid-1] && ( (nums[mid] == nums[high]) || (nums[mid] > nums[mid+1])))
                {
                    return nums[mid];
                }
                else if(nums[mid] < nums[mid-1])
                {
                    high = mid -1;
                }
                else
                {
                    low = mid + 1;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error is " + e.getMessage());
        }
        return -1;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] nums = {3, 1, 9, 2, 5, 4, 7};
        Arrays.sort(nums);
        int peakElement = binarySearch(nums);

        // Checking peak element is found or not
        if(peakElement != -1)
        {
            System.out.println("Peak element found " + peakElement );
        }
        else
        {
            System.out.println("Peak element not found ");
        }
    }
}
