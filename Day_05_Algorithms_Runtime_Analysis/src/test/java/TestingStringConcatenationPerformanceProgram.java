import org.junit.jupiter.api.Test;
import stringconcatenationperformance.StringConcatenationPerformance;
// Creating class TestingStringConcatenationPerformanceProgram to test our program whether it's working properly or not
public class TestingStringConcatenationPerformanceProgram
{
    @Test
    void f()
    {
        // Creating object of StringConcatenationPerformance class
        StringConcatenationPerformance concatenation = new StringConcatenationPerformance();

        // Calling methods of the class and displaying the result
        System.out.println("Running time of String " + concatenation.concatenationOfString());
        System.out.println("Running time of StringBuilder " + concatenation.concatenationOfStringBuilder());
        System.out.println("Running time of StringBuffer " + concatenation.concatenationOfStringBuffer());
    }
}
