import java.util.Arrays;

public class SortProductPrice {

    public static void quickSort(double[] productPrices, int low, int high) {
        if (low < high) {
            int pi = partition(productPrices, low, high);
            quickSort(productPrices, low, pi - 1);
            quickSort(productPrices, pi + 1, high);
        }
    }

    private static int partition(double[] productPrices, int low, int high) {
        double pivot = productPrices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (productPrices[j] <= pivot) {
                i++;
                double temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }
        double temp = productPrices[i + 1];
        productPrices[i + 1] = productPrices[high];
        productPrices[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        double[] productPrices = {599.99, 299.49, 199.99, 450.75, 150.00};
        System.out.println("Unsorted Product Prices: " + Arrays.toString(productPrices));
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));
    }
}
