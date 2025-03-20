package sortinglargedataefficiently;
// Creating main class to calculate running time of BubbleSort, MergeSort and QuickSort
public class MainClass
{
    // MainClass method
    public static void main(String[] args)
    {
        // Creating objects of the classes
        BubbleSort sort1 = new BubbleSort();
        MergeSort sort2 = new MergeSort();
        QuickSort sort3 = new QuickSort();

        // Calculating running time of Bubble Sort
        int[] arr = {9,18,73,6,55,45,13,2,10,99,48,41,67,38,79,89,1,2,58,32,79,34,41,73,84,29,21,25,93,96,19,13,56,103,110,101,190,150,135,167};
        long startTimeOfBubbleSort = System.nanoTime();
        sort1.bubbleSort(arr);
        long endTimeOfBubbleSort = System.nanoTime();
        System.out.println("Runtime of Bubble Sort " + (endTimeOfBubbleSort -startTimeOfBubbleSort));

        // Calculating running time of Merge Sort
        int[] arr1 = {9,18,73,6,55,45,13,2,10,99,48,41,67,38,79,89,1,2,58,32,79,34,41,73,84,29,21,25,93,96,19,13,56,103,110,101,190,150,135,167};
        long startTimeOfMergeSort = System.nanoTime();
        sort2.mergeSort(arr1,0,arr1.length-1);
        long endTimeOfMergeSort = System.nanoTime();
        System.out.println("Runtime of Merge Sort " + (endTimeOfMergeSort - startTimeOfMergeSort));

        // Calculating running time of Quick Sort
        int[] arr2 = {9,18,73,6,55,45,13,2,10,99,48,41,67,38,79,89,1,2,58,32,79,34,41,73,84,29,21,25,93,96,19,13,56,103,110,101,190,150,135,167};
        long startTimeOfQuickSort = System.nanoTime();
        sort3.quickSort(arr2,0,arr2.length-1);
        long endTimeOfQuickSort = System.nanoTime();
        System.out.println("Runtime of Quick Sort " + (endTimeOfQuickSort - startTimeOfQuickSort));
    }
}
