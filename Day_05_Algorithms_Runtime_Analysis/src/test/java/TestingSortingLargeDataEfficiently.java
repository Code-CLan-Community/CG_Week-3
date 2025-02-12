import org.junit.jupiter.api.Test;
import sortinglargedataefficiently.BubbleSort;
import sortinglargedataefficiently.MergeSort;
import sortinglargedataefficiently.QuickSort;
// Creating class TestingSortingLargeDataEfficiently to test our program whether it's working properly or not
public class TestingSortingLargeDataEfficiently
{
    @Test
    void f()
    {
        // Creating objects of the classes
        BubbleSort sort1 = new BubbleSort();
        MergeSort sort2 = new MergeSort();
        QuickSort sort3 = new QuickSort();

        // Calling methods of different classes
        int[] arr = {9,18,73,6,55,45,13,2,10,99,48,41,67,38,79,89,1,2,58,32,79,34,41,73,84,29,21,25,93,96,19,13,56,103,110,101,190,150,135,167};
        sort1.bubbleSort(arr);
        int[] arr1 = {9,18,73,6,55,45,13,2,10,99,48,41,67,38,79,89,1,2,58,32,79,34,41,73,84,29,21,25,93,96,19,13,56,103,110,101,190,150,135,167};
        sort2.mergeSort(arr1,0,arr1.length-1);
        int[] arr2 = {9,18,73,6,55,45,13,2,10,99,48,41,67,38,79,89,1,2,58,32,79,34,41,73,84,29,21,25,93,96,19,13,56,103,110,101,190,150,135,167};
        sort3.quickSort(arr2,0,arr2.length-1);
    }
}
