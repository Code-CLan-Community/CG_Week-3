import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import searchingspecificword.SearchSpecificWord;

public class TestingSearchSpecificWordProgram
{
    @Test
    void f()
    {
        String sentence = "Linear search is the simplest searching algorithm";
        String word = "simplest";

        SearchSpecificWord obj = new SearchSpecificWord();
        Assertions.assertEquals("Linear search is the simplest searching algorithm",obj.findWord(sentence,word));
    }
}
