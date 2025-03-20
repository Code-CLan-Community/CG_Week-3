package rotatedsortedarray;
// Creating class RotationPointInRotatedSortedArray to find rotation point using Binary Search
public class RotationPointInRotatedSortedArray
{
    // Method to find the rotation point in a rotated sorted array using Binary Search
    public static int findRotationPoint(int[] rotatedArray)
    {
        int low = 0;
        int high = rotatedArray.length - 1;

        while (low < high)
        {
            int mid = low + (high - low) / 2;

            if (rotatedArray[mid] > rotatedArray[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        // Return the index of the rotation point
        return low;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] rotatedArray = { 3, 2, -2, 4, 9, 6, 1};
        int rotationPoint = findRotationPoint(rotatedArray);
        System.out.println("Rotation point is at index of " + rotationPoint);
    }
}
