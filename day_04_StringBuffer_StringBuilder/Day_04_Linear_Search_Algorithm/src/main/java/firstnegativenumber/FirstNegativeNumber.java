package firstnegativenumber;

// Creating class FirstNegativeNumber to find first negative number in an array
public class FirstNegativeNumber
{
    // Method to find index of negative element in array
    public static int findIndex(int[] nums)
    {
        // Traversing each element of the array
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                return i;
        }
        return -1;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] nums = {1,4,5,2,-1,3,10,9};

        // Checking element is found or not
        if(findIndex(nums) != -1)
            System.out.println("Element found and index is " + findIndex(nums));
        else
            System.out.println("Element not found");
    }
}
