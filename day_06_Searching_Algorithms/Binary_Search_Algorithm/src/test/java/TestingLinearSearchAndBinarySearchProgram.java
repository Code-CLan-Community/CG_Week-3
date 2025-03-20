import linearsearchandbinarysearch.LinearSearchAndBinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingLinearSearchAndBinarySearchProgram
{
    @Test
    void f1()
    {
        int[] arr = { 3, 2, -2, 4, 9, 6, 1};

        LinearSearchAndBinarySearch obj = new LinearSearchAndBinarySearch();
        Assertions.assertEquals(-2,obj.linearSearch(arr));
    }

    @Test
    void f2()
    {
        int[] arr = { 3, 2, -2, 4, 9, 6, 1};

        LinearSearchAndBinarySearch obj = new LinearSearchAndBinarySearch();
        Assertions.assertEquals(6,obj.binarySearch(arr,9));
    }
}
