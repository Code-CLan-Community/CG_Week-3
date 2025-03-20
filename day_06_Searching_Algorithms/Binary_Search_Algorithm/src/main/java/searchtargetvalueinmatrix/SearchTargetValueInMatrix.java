package searchtargetvalueinmatrix;
// Creating class SearchTargetValueInMatrix to find whether a target value is present or not in 2D sorted matrix
public class SearchTargetValueInMatrix
{
    // Method to search for a target value in a 2D sorted matrix using Binary Search
    public static boolean searchInMatrix(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int low = 0;
        int high = rows * columns - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            int midValue = matrix[mid / columns][mid % columns];

            if (midValue == target)
            {
                    return true;
            }
            else if (midValue < target)
            {
                    low = mid + 1;
            }
            else
            {
                    high = mid - 1;
            }
        }
        // Target not found
        return false;
    }

    // Main method
    public static void main(String[] args)
    {
        int[][] matrix = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12} };

        boolean found = searchInMatrix(matrix, 5);
        // Checking Target Value found or not in a 2D Sorted Matrix
        if(found)
            System.out.println("Target Value found in a 2D Sorted Matrix");
        else
            System.out.println("Target Value not found in a 2D Sorted Matrix");
    }
}
