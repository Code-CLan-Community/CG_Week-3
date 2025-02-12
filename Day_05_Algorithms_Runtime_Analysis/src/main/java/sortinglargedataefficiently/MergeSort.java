package sortinglargedataefficiently;

// Creating class MergeSort to implement Merge Sort Algorithm
public class MergeSort
{
    // Method to implement Merge Sort
    public void mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = low + (high - low)/2;

            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merger(arr,low,mid,high);
        }
    }

    // Method to merge the divided array
    public void merger(int[] arr, int low, int mid, int high)
    {
        int[] mergeArray = new int[(high - low) + 1];
        int idx1 = low;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= high)
        {
            if(arr[idx1] <= arr[idx2])
            {
                mergeArray[x++] = arr[idx1++];
            }
            else
            {
                mergeArray[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid)
        {
            mergeArray[x++] = arr[idx1++];
        }

        while(idx2 <= high)
        {
            mergeArray[x++] = arr[idx2++];
        }

        // Copying the element of mergeArray into original array
        int j = low;
        for(int i=0; i<mergeArray.length;i++)
        {
            arr[j++] = mergeArray[i];
        }

    }

}
