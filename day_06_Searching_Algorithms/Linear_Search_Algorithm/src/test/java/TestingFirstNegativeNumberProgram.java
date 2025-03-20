import firstnegativenumber.FirstNegativeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingFirstNegativeNumberProgram
{
    @Test
    void f()
    {
        int[] nums = {1,4,5,2,-1,3,10,9};

        FirstNegativeNumber obj = new FirstNegativeNumber();
        Assertions.assertEquals(4,obj.findIndex(nums));
    }
}
