import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reversestring.ReverseStringUsingStringBuilder;

public class TestingReverseStringProgram
{
    // Testing method of ReverseStringUsingStringBuilder class
    @Test
    void f1()
    {
        ReverseStringUsingStringBuilder obj = new ReverseStringUsingStringBuilder();
        Assertions.assertEquals("olleh", obj.reverseString("hello"));
    }
}
