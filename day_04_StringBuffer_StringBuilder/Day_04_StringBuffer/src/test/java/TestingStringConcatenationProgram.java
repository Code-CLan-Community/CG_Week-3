import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringconcatenation.StringConcatenation;

public class TestingStringConcatenationProgram
{
    @Test
    void f()
    {
        String[] sentence = { "String", "Builder", "and", "String", "Buffer" };

        StringConcatenation  obj = new StringConcatenation();
        Assertions.assertEquals("StringBuilderandStringBuffer",obj.concatenateStrings(sentence));
    }
}
