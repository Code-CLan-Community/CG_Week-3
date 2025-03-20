import firstandlastoccurrence.FirstAndLastOccurrenceOfElementInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingFirstAndLastOccurrenceOfElementInArrayProgram
{
    @Test
    void f1()
    {
        int[] arr = {1,2,3,5,7,9,9};

        FirstAndLastOccurrenceOfElementInArray obj = new FirstAndLastOccurrenceOfElementInArray();
        Assertions.assertEquals(5,obj.findFirstOccurrence(arr,9));
    }

    @Test
    void f2()
    {
        int[] arr = {1,2,3,5,7,9,9};

        FirstAndLastOccurrenceOfElementInArray obj = new FirstAndLastOccurrenceOfElementInArray();
        Assertions.assertEquals(6,obj.findLastOccurrence(arr,9));
    }
}
