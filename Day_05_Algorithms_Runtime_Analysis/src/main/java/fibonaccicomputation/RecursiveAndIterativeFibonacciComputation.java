package fibonaccicomputation;
// Creating class RecursiveAndIterativeFibonacciComputation to compare running time of recursive and iterative method to compute fibonacci number
public class RecursiveAndIterativeFibonacciComputation
{
    // Recursive Method to compute fibonacci
    public static int fibonacciRecursive(int num)
    {
        if (num <= 1)
            return num;

        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    // Iterative Method to compute fibonacci
    public static int fibonacciIterative(int num)
    {
        int num1 = 0, num2 = 1;
        int sum;
        for (int i = 2; i <= num; i++)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return num2;
    }

    // Main Method
    public static void main(String[] args)
    {
        // Calculating running time of recursive method
        long startTimeOfRecursiveMethod = System.nanoTime();
        fibonacciRecursive(50);
        long endTimeOfRecursiveMethod = System.nanoTime();
        System.out.println("Time Taken By Recursive Method " + (endTimeOfRecursiveMethod - startTimeOfRecursiveMethod));

        // Calculating running time of iterative method
        long startTimeOfIterativeMethod = System.nanoTime();
        fibonacciIterative(50);
        long endTimeOfIterativeMethod = System.nanoTime();
        System.out.println("Time Taken By Iterative Method " + (endTimeOfIterativeMethod - startTimeOfIterativeMethod));
    }
}
