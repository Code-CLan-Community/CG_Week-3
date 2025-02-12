import linearsearchandbinarysearch.LinearSearchAndBinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peakelementinarray.PeakElementInArray;

import java.util.Arrays;

public class TestingPeakElementInArrayProgram
{
    @Test
    void f1()
    {
        int[] nums = {3, 1, 9, 2, 5, 4, 7};
        Arrays.sort(nums);
        PeakElementInArray obj = new PeakElementInArray();
        Assertions.assertEquals(9,obj.binarySearch(nums));
    }
}
