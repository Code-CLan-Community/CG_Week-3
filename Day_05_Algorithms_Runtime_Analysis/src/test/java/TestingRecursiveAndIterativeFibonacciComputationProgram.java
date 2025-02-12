import org.junit.jupiter.api.Test;
import static fibonaccicomputation.RecursiveAndIterativeFibonacciComputation.fibonacciIterative;
import static fibonaccicomputation.RecursiveAndIterativeFibonacciComputation.fibonacciRecursive;
// Creating class TestingRecursiveAndIterativeFibonacciComputationProgram to test our program whether it's working properly or not
public class TestingRecursiveAndIterativeFibonacciComputationProgram
{
    @Test
    void f()
    {
        fibonacciRecursive(30);
        fibonacciIterative(30);
    }
}
