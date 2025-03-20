import java.util.Arrays;

public class SortArrayBookPrice {

    public static void mergeSort(double[] bookPrices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(bookPrices, left, mid);
            mergeSort(bookPrices, mid + 1, right);
            merge(bookPrices, left, mid, right);
        }
    }

    private static void merge(double[] bookPrices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        System.arraycopy(bookPrices, left, leftArray, 0, n1);
        System.arraycopy(bookPrices, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                bookPrices[k] = leftArray[i];
                i++;
            } else {
                bookPrices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            bookPrices[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            bookPrices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        double[] bookPrices = {599.99, 299.49, 199.99, 450.75, 150.00};
        System.out.println("Unsorted Book Prices: " + Arrays.toString(bookPrices));
        mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));
    }
}