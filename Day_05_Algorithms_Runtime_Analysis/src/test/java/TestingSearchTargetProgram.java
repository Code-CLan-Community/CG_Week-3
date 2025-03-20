import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import searchtarget.BinarySearch;
import searchtarget.LinearSearch;

import java.util.Arrays;
// Creating class TestingSearchTargetProgram to test our program whether it's working properly or not
public class TestingSearchTargetProgram
{
    @Test
    void f()
    {
        int[] arr = {1,2,4,3,9,5,7,6,10,67,2,56,25,90,56,48,78,34,56,99,12,67,39,49};
        int target = 9;

        LinearSearch search1 = new LinearSearch();
        BinarySearch search2 = new BinarySearch();

        Assertions.assertEquals(4,search1.findTarget(arr,9));
        Arrays.sort(arr);
        Assertions.assertEquals(8,search2.findTarget(arr,9));
    }
}
