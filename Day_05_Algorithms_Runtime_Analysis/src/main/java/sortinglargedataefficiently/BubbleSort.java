package sortinglargedataefficiently;

// Creating class BubbleSort to implement Bubble Sort Algorithm
public class BubbleSort
{
    // Method to implement Bubble Sort
    public void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;

        for(int i=0;i<n-1;i++)
        {
            swapped = false;
            for(int j=0;j<n-i-1;i++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
