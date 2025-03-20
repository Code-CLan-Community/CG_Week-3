import comparestringbufferandstringbuilder.CompareStringBufferAndStringBuilder;
import org.junit.jupiter.api.Test;

public class TestingStringBufferAndStringBuilderPerformanceProgram
{
    @Test
    void f()
    {
        CompareStringBufferAndStringBuilder obj = new CompareStringBufferAndStringBuilder();
        obj.concatenateStringsUsingBuffer();
    }

    @Test
    void f1()
    {
        CompareStringBufferAndStringBuilder obj = new CompareStringBufferAndStringBuilder();
        obj.concatenateStringsUsingBuilder();
    }
}
