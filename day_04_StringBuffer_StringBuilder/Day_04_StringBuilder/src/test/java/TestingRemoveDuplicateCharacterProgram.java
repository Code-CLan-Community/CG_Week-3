import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import removeduplicatecharacter.RemoveDuplicateCharacterFromString;

public class TestingRemoveDuplicateCharacterProgram
{
    // Testing method of RemoveDuplicateCharacterFromString class
    @Test
    void f2()
    {
        RemoveDuplicateCharacterFromString obj = new RemoveDuplicateCharacterFromString();
        Assertions.assertEquals("neraj",obj.removeDuplicate("neeraj"));
    }
}
