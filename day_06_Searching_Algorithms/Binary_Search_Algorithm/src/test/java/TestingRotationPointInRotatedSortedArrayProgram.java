import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rotatedsortedarray.RotationPointInRotatedSortedArray;


public class TestingRotationPointInRotatedSortedArrayProgram
{
    @Test
    void f1()
    {
        int[] rotatedArray = { 3, 2, -2, 4, 9, 6, 1};
        RotationPointInRotatedSortedArray obj = new RotationPointInRotatedSortedArray();
        Assertions.assertEquals(6,obj.findRotationPoint(rotatedArray));
    }
}
