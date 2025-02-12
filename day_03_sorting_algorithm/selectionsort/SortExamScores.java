
import java.util.Arrays;

public class SortExamScores {

    public static void selectionSort(int[] examScores) {
        int n = examScores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = examScores[minIndex];
            examScores[minIndex] = examScores[i];
            examScores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 60, 88};
        System.out.println("Unsorted Exam Scores: " + Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));
    }
}
