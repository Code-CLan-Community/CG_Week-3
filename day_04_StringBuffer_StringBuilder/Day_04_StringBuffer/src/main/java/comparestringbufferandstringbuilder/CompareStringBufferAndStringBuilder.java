package comparestringbufferandstringbuilder;

// Creating class CompareStringBufferAndStringBuilder to compare performance of StringBuffer and StringBuilder
public class CompareStringBufferAndStringBuilder
{
    // Method to measure the time taken by StringBuilder to complete the concatenation
    public static long concatenateStringsUsingBuffer()
    {
        String str = "hello";
        StringBuffer result = new StringBuffer();
        long bufferStartTime = System.nanoTime();

        for(int i=0;i<1000000;i++)
        {
            result.append(str);
        }

        long bufferEndTime = System.nanoTime();
        return (bufferEndTime - bufferStartTime);

    }

    // Method to measure the time taken by StringBuilder to complete the concatenation
    public static long concatenateStringsUsingBuilder()
    {
        String str = "hello";
        StringBuilder result = new StringBuilder();
        long builderStartTime = System.nanoTime();

        for(int i=0;i<1000000;i++)
        {
            result.append(str);
        }

        long builderEndTime = System.nanoTime();
        return (builderEndTime - builderStartTime);
    }

    // Main Method
    public static void main(String[] args)
    {
        System.out.println("Time taken by StringBuffer to concatenate string is " + concatenateStringsUsingBuffer());
        System.out.println("Time taken by StringBuilder to concatenate string is " + concatenateStringsUsingBuilder());
    }
}