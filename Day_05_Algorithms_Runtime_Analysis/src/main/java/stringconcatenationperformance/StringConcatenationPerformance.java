package stringconcatenationperformance;
// Creating class StringConcatenationPerformance to compare running time of String, StringBuilder and StringBuffer when concatenation operation performed
public class StringConcatenationPerformance
{
    // Method to perform concatenation operation on StringBuffer
    public long concatenationOfStringBuffer()
    {
        long startTime = System.nanoTime();
        StringBuffer str = new StringBuffer("Hello");
        for(int i=0; i<100000; i++)
        {
            str = str.append("Hello");
        }
        long endTime = System.nanoTime();

        return (endTime - startTime);
    }

    // Method to perform concatenation operation on StringBuilder
    public long concatenationOfStringBuilder()
    {
        long startTime = System.nanoTime();
        StringBuilder str = new StringBuilder("Hello");
        for(int i=0; i<100000; i++)
        {
            str = str.append("Hello");
        }
        long endTime = System.nanoTime();

        return (endTime - startTime);
    }

    // Method to perform concatenation operation on String
    public long concatenationOfString()
    {
        long startTime = System.nanoTime();
        String str = "Hello";
        for(int i=0; i<100000; i++)
        {
            str = str + "Hello";
        }
        long endTime = System.nanoTime();

        return (endTime - startTime);
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating object of StringConcatenationPerformance class
        StringConcatenationPerformance concatenation = new StringConcatenationPerformance();

        // Calling methods of the class and displaying the result
        System.out.println("Running time of String " + concatenation.concatenationOfString());
        System.out.println("Running time of StringBuilder " + concatenation.concatenationOfStringBuilder());
        System.out.println("Running time of StringBuffer " + concatenation.concatenationOfStringBuffer());
    }
}
