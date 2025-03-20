import java.util.Arrays;
public class BubbleSort 
{
    public static void bubbleSort(int[] studentmarks) 
    {
        int n = studentmarks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (studentmarks[j] > studentmarks[j + 1]) 
                {
                    // Swap studentmarks[j] and studentmarks[j+1]
                    int temp = studentmarks[j];
                    studentmarks[j] = studentmarks[j + 1];
                    studentmarks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) 
            //Stop if no swaps occurred
            break;
            
        }
    }

    public static void main(String[] args) 
    {
        int[] studentmarks = {78, 83, 98, 84, 62};
        bubbleSort(studentmarks);
        System.out.println(Arrays.toString(studentmarks));
    }
}

